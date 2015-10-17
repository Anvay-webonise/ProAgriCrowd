package com.webonise.proagricrowd.pojos

import com.fasterxml.jackson.annotation.JsonIgnore
import groovy.transform.Canonical
import groovy.transform.CompileStatic

@Canonical
@CompileStatic
class LoginResponse {
    String authToken
    String message
    @JsonIgnore
    int userId
}
