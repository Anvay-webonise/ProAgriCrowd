package com.webonise.proagricrowd.dao.impl

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.UserDao
import com.webonise.proagricrowd.pojos.SignUpRequest
import com.webonise.proagricrowd.pojos.SignUpResponse
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.jooq.DSLContext
import org.jooq.Record1

import static com.webonise.proagricrowd.sql.Tables.USERS

@Slf4j
@CompileStatic
class UserDaoImpl implements UserDao{

    final DSLContext dslContext

    @Inject
    UserDaoImpl(DSLContext dslContext) {
        this.dslContext = dslContext
    }

    @Override
    SignUpResponse saveUserDetails(SignUpRequest signUpRequest) {
        return null
    }

    @Override
    int authenticateUser(String username, String password) {

        Record1<Integer> userNamePasswordResult = dslContext.select(USERS.USR_ID)
                .from(USERS)
                .where(USERS.USR_NAME.eq(username))
                .and(USERS.USR_PASSWORD.eq(password))
                .fetchOne()

        if(!userNamePasswordResult) {

            Record1<Integer> userNameResult = dslContext.select(USERS.USR_ID)
                    .from(USERS)
                    .where(USERS.USR_NAME.eq(username))
                    .fetchOne()

            if(!userNameResult) {
                throw new NoSuchElementException("Username not recognized.")
            } else {
                throw new NoSuchElementException("Your password seems to be incorrect.")
            }
        }

        return userNamePasswordResult.getValue(USERS.USR_ID)
    }
}
