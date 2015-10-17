package com.webonise.proagricrowd.exceptions

import org.restlet.data.Status

class NoContentFoundException extends ResourceException{

    NoContentFoundException(String message){
        super(Status.SUCCESS_NO_CONTENT,message)
    }
}
