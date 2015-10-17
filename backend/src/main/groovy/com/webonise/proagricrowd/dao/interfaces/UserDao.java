package com.webonise.proagricrowd.dao.interfaces;


import com.webonise.proagricrowd.pojos.SignUpRequest;
import com.webonise.proagricrowd.pojos.SignUpResponse;

public interface UserDao {
    SignUpResponse saveUserDetails(SignUpRequest signUpRequest);
    int authenticateUser(String username, String password);
}
