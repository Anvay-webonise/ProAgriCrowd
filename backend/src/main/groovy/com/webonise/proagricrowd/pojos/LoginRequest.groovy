package com.webonise.proagricrowd.pojos

import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
class LoginRequest {
    String userName
    String password
}
