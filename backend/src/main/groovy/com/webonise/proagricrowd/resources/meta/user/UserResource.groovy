package com.webonise.proagricrowd.resources.meta.user

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.UserDao
import com.webonise.proagricrowd.pojos.SignUpRequest
import com.webonise.proagricrowd.pojos.SignUpResponse
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.resource.Post
import org.restlet.resource.ServerResource

@Slf4j
@CompileStatic
class UserResource extends ServerResource{

    @Inject
    UserDao userDao

    @Post
    SignUpResponse doSignUp(SignUpRequest signUpRequest){
        return userDao.saveUserDetails(signUpRequest)
    }

}
