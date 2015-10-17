package com.webonise.proagricrowd.service

import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.magnus.datamodel.dao.RedisDao
import com.webonise.proagricrowd.dao.RedisDao
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

import java.util.concurrent.TimeUnit

/**
 * Created by webonise on 27/8/15.
 */

@Slf4j
@CompileStatic
abstract class AbstractRedisService {
    private static final Integer REDIS_KEY_TTL_IN_DAYS = 1;

    final ObjectMapper objectMapper
    final RedisDao redisDao

    AbstractRedisService(ObjectMapper objectMapper, RedisDao redisDao) {
        this.objectMapper = objectMapper
        this.objectMapper.disable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
        this.redisDao = redisDao
    }

    protected <T> T getRedisJson(String redisKey, Class<T> clazz) {
        assert redisKey : "RedisKey cannot be null or empty"
        assert clazz : "Need a class to be retrieved from Redis"
        Object json = redisDao.get(redisKey)
        if (!json) {
            log.debug("Redis does not have any record for redis key {}", redisKey)
            return null
        }
        return clazz.cast(objectMapper.readValue(json, clazz))
    }

    protected void deleteFromRedisByKey(String redisKey) {
        assert redisKey : "Null key can not be deleted"
        redisDao.deleteKey(redisKey)
    }

    protected void addToRedisByKey(String redisKey, Object value) {
        redisDao.add(redisKey, getObjectMapper().writeValueAsString(value));
        redisDao.addTTLToKey(redisKey, (int) TimeUnit.SECONDS.convert(REDIS_KEY_TTL_IN_DAYS, TimeUnit.DAYS))
    }
}
