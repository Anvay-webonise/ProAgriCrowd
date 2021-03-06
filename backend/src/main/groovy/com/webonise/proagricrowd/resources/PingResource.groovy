package com.webonise.proagricrowd.resources

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.resource.Get
import org.restlet.resource.ServerResource

@Slf4j
@CompileStatic
class PingResource extends ServerResource {

    static class Pong {
        final boolean pong = true
    }

    @Get
    Pong pinged() {
        log.info("They called ping!")
        def toReturn = new Pong()
        return toReturn
    }
}
