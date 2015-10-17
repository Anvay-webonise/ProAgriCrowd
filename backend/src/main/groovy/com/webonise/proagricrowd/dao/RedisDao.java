package com.webonise.proagricrowd.dao;

import redis.clients.jedis.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RedisDao {

    private final static Integer timeout = 3;
    private final JedisPool pool;
    private final static String STARTING_CURSOR = "0";
    private final Integer databaseIndex;


    public RedisDao(String redisHost, int redisPort, int databaseIndex){
        this.databaseIndex = databaseIndex;
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(1);
        pool = new JedisPool(poolConfig,redisHost,redisPort,timeout);
    }


    public Long addSet(String key,String redisCacheable) {
        try(Jedis jedis = getConnection()){
            return jedis.sadd(key, redisCacheable);
        }
    }

    public String add(String key, String value) {
        try(Jedis jedis = getConnection()){
            return jedis.set(key, value);
        }

    }

    public Set<String> getSet(String key) {
       try(Jedis jedis = getConnection()){
           return  jedis.smembers(key);
       }
    }

    public String get(String key) {
        try(Jedis jedis = getConnection()){
            return jedis.get(key);
        }
    }

    public boolean isSetMember(String setKey, String UUID) {
        try(Jedis jedis = getConnection()){
            return jedis.sismember(setKey, UUID);
        }
    }

    public  Set<String> getKeySet(String clientId){

        Set<String> keySet = new HashSet<String>();
        try(Jedis jedis = getConnection()){
            ScanParams params = new ScanParams().match(clientId);
            scanKeyset(STARTING_CURSOR, params,keySet,jedis);
            return keySet;
        }

    }

    private Set<String> scanKeyset(String startingCursor,ScanParams params ,Set<String> keySet,Jedis jedis){

        ScanResult<String> result  = jedis.scan(startingCursor, params);
        keySet.addAll(result.getResult());
        if(!result.getStringCursor().equals(STARTING_CURSOR)){
            scanKeyset(result.getStringCursor(),params,keySet,jedis);
        }
        return keySet;
    }


    public long addTTLToKey(String key,int ttlInSeconds){
        try(Jedis jedis = getConnection()) {
            return jedis.expire(key, ttlInSeconds);
        }
    }

    public long getTTLForKey(String key){
        try(Jedis jedis = getConnection()){
            return jedis.ttl(key);
        }
    }

    public long deleteKeySet(Collection<String> keySet){
        try(Jedis jedis = getConnection()){
            return jedis.del(keySet.toArray(new String[keySet.size()]));
        }
    }

    public long deleteKey(String key) {
        try(Jedis jedis = getConnection()){
            return jedis.del(key);
        }
    }

    private Jedis getConnection(){
        Jedis jedis = pool.getResource();
        try{
            jedis.select(databaseIndex);
            return jedis;
        }catch(Exception e){
            jedis.close();
            throw new IllegalStateException("Could not connect to the desired databaseIndex",e);
        }
    }

}
