package com.webonise.proagricrowd.interceptor

import com.google.inject.Inject
import com.webonise.proagricrowd.service.interfaces.AuthDataService
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.Context
import org.restlet.Request
import org.restlet.Response
import org.restlet.data.Status
import org.restlet.routing.Filter

@Slf4j
@CompileStatic
class AuthenticationFilter extends Filter {

    private static final String AUTH_TOKEN = "authToken"
    final AuthDataService authDataService

    @Inject
    AuthenticationFilter(Context context, AuthDataService authDataService) {
        super(context)
        this.authDataService = authDataService
    }

    @Override
    int beforeHandle(Request request, Response response) {
        String authToken = request.getHeaders().getValues(AUTH_TOKEN)
        if (authToken && authDataService.getAuthenticatedUserMetadata(authToken)) {
            log.debug("authToken is present")
            CONTINUE
        }else {
            log.info("authToken is not present")
            response.setStatus(Status.CLIENT_ERROR_FORBIDDEN)
            STOP
        }
    }
}
