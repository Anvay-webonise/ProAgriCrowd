package com.webonise.proagricrowd.service

import com.google.inject.AbstractModule
import com.webonise.proagricrowd.service.impl.AuthDataServiceImpl
import com.webonise.proagricrowd.service.interfaces.AuthDataService
import groovy.transform.CompileStatic

@CompileStatic
class SAPIServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AuthDataService).to(AuthDataServiceImpl)
    }
}
