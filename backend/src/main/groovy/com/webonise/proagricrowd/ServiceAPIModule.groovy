package com.webonise.proagricrowd

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import restling.guice.modules.RestlingApplicationModule

@Slf4j
@CompileStatic
class ServiceAPIModule extends RestlingApplicationModule {

    final Class<RootRouter> routerClass = RootRouter

    @Override
    void configureCustomBindings() {
        //this.install(new DataAccessModule())
        //bind(AuthenticationFilter)
    }
}
