package com.webonise.proagricrowd.resources.user

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.UserDao
import com.webonise.proagricrowd.pojos.AuthenticatedUserMetadata
import com.webonise.proagricrowd.pojos.LoginRequest
import com.webonise.proagricrowd.pojos.LoginResponse
import com.webonise.proagricrowd.pojos.SignUpRequest
import com.webonise.proagricrowd.pojos.SignUpResponse
import com.webonise.proagricrowd.service.interfaces.AuthDataService
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.resource.Post
import org.restlet.resource.ServerResource

@Slf4j
@CompileStatic
class UserResource extends ServerResource{

    @Inject
    UserDao userDao

    @Inject
    AuthDataService authDataService

    @Post
    SignUpResponse doSignUp(SignUpRequest signUpRequest){
        return userDao.saveUserDetails(signUpRequest)
    }

    @Post("/")
    LoginResponse doLogin(LoginRequest loginRequest) {
        try {
            String userName = loginRequest.getUserName()
            int userId = userDao.authenticateUser(userName, loginRequest.getPassword())
            AuthenticatedUserMetadata authenticatedUserMetadata = new AuthenticatedUserMetadata(userId: userId)
            String authToken = UUID.randomUUID().toString()
            authDataService.addAuthenticatedUserMetadata(authToken, authenticatedUserMetadata)
            LoginResponse loginResponse = new LoginResponse(authToken, "You have sucessfully logged in")
            loginResponse.setUserId(userId)
            return loginResponse
        } catch (NoSuchElementException ex) {
            return new LoginResponse(null, ex.getMessage())
        }
    }

}
