package com.webonise.proagricrowd

import com.google.inject.Inject
import com.webonise.proagricrowd.resources.meta.MetaRouter
import com.webonise.proagricrowd.resources.meta.user.UserRouter
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.Context
import restling.restlet.RestlingRouter

@Slf4j
@CompileStatic
class RootRouter  extends RestlingRouter {

    public RootRouter() { super(); }

    @Inject
    public RootRouter(Context context) { super(context); }

    @Override
    void init() throws Exception {
        attachSubRouter("/meta", MetaRouter)
        attachSubRouter("/user", UserRouter)
    }
}
