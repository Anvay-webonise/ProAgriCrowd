package com.webonise.proagricrowd.service.interfaces;

import com.webonise.proagricrowd.pojos.AuthenticatedUserMetadata;
import org.restlet.Request;

public interface AuthDataService {
    AuthenticatedUserMetadata getAuthenticatedUserMetadata(String authToken);
    void addAuthenticatedUserMetadata(String authToken, Object object);
    void deleteAuthenticatedUserMetadata(String authToken);
    String getUserNameAssociatedWithAuthToken(Request request);
    void deleteAuthenticatedUserMetadata(Request request);
}
