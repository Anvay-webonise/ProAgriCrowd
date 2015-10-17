package com.webonise.proagricrowd.resources.user

import restling.restlet.RestlingRouter

/**
 * Created by webonise on 17/10/15.
 */
class UserRouter extends RestlingRouter{
    @Override
    void init() throws Exception {
        attach("/signup", UserResource)
    }
}

