package com.webonise.proagricrowd.exceptions

import org.restlet.resource.Status

@Status(value = 403)
class SignUpException extends Exception{

    SignUpException(String message){
        super(message)
    }
}
