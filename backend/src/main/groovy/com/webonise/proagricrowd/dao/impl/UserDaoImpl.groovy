package com.webonise.proagricrowd.dao.impl

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.UserDao
import com.webonise.proagricrowd.dataaccess.providers.DSLContextProvider
import com.webonise.proagricrowd.exceptions.SignUpException
import com.webonise.proagricrowd.pojos.SignUpRequest
import com.webonise.proagricrowd.pojos.SignUpResponse
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.jooq.DSLContext
import org.jooq.Record

import static com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS
import static com.webonise.proagricrowd.sql.tables.Users.USERS

@Slf4j
@CompileStatic
class UserDaoImpl implements UserDao{

    @Inject
    DSLContextProvider dslContextProvider

    DSLContext dslContext = dslContextProvider.get()
    @Override
    SignUpResponse saveUserDetails(SignUpRequest signUpRequest) {
        SignUpResponse signUpResponse = new SignUpResponse()
        try{

            if (signUpRequest.username == null){
                signUpResponse.setMessage("Please Enter Username")
                return signUpResponse
            }
            else if (signUpRequest.password == null){
                signUpResponse.setMessage("Please Enter Password")
                return signUpResponse
            }
            else if (signUpRequest.email == null){
                signUpResponse.setMessage("Please Enter Email")
                return signUpResponse
            }
            else if (signUpRequest.mobile_no == null){
                signUpResponse.setMessage("Please Enter Mobile Number")
                return signUpResponse
            }
            else if (signUpRequest.user_type != null){
                signUpResponse.setMessage("Please Select User Type")
                return signUpResponse
            }
            else{
                int userType =1
                dslContext.insertInto(INDIVIDUALS,INDIVIDUALS.IND_EMAIL,INDIVIDUALS.IND_CELLNO).values(signUpRequest.getEmail(),signUpRequest.getMobile_no())
                Record<Integer> userID = dslContext.select(INDIVIDUALS.IND_ID)
                        .from(INDIVIDUALS)
                        .where(INDIVIDUALS.IND_EMAIL.eq(signUpRequest.email))
                        .fetchOne()
                switch (signUpRequest.user_type){
                    case "EXPERT" : userType = 2
                                    break
                    case "COMPANY" : userType = 3
                        break
                    case "INDIVIDUAL" : userType = 4
                        break
                    case "ORGANIZATION" : userType = 5
                        break
                    case "GOVT" : userType = 6
                        break
                }
                //dslContext.insertInto(USERS,USERS.USR_NAME,USERS.USR_TYP_ID).values(userID,signUpRequest.getUsername(),userType)
                signUpResponse.setMessage("Sign Up Successful")
                return signUpResponse
            }

        }catch (SignUpException se){
            signUpResponse.setMessage(se.getMessage())
            return signUpResponse
        }
    }
}
