package com.webonise.proagricrowd.service.impl

import com.fasterxml.jackson.databind.ObjectMapper
import com.google.inject.Inject
import com.google.inject.name.Named
import com.webonise.proagricrowd.dao.RedisDao
import com.webonise.proagricrowd.pojos.AuthenticatedUserMetadata
import com.webonise.proagricrowd.service.AbstractRedisService
import com.webonise.proagricrowd.service.interfaces.AuthDataService
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.Request

@Slf4j
@CompileStatic
class AuthDataServiceImpl extends AbstractRedisService implements AuthDataService{

    @Inject
    AuthDataServiceImpl(ObjectMapper objectMapper) {
        super(objectMapper, new RedisDao("127.0.0.1", 6379, 1))
    }

    @Override
    AuthenticatedUserMetadata getAuthenticatedUserMetadata(String authToken) {
        return getRedisJson(authToken, AuthenticatedUserMetadata)
    }

    @Override
    void addAuthenticatedUserMetadata(String authToken, Object object) {
        addToRedisByKey(authToken, object)
    }

    @Override
    void deleteAuthenticatedUserMetadata(String authToken) {
        deleteFromRedisByKey(authToken)
    }

    @Override
    String getUserNameAssociatedWithAuthToken(Request request) {
        String authToken = request.getHeaders().getValues("authToken")
        assert authToken: "Authentication token can not be null"
        getAuthenticatedUserMetadata(authToken).getUserId()
    }

    @Override
    void deleteAuthenticatedUserMetadata(Request request) {
        String authToken = request.getHeaders().getValues("authToken")
        assert authToken: "Authentication token can not be null"
        deleteAuthenticatedUserMetadata(authToken)
    }
}
