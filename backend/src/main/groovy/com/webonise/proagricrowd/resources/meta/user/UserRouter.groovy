package com.webonise.proagricrowd.resources.meta.user

import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter

@CompileStatic
class UserRouter extends RestlingRouter{
    @Override
    void init() throws Exception {
        attach("/signup", UserResource)
    }
}

