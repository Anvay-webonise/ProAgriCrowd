package com.webonise.proagricrowd.dataaccess.providers

import com.google.inject.Inject
import com.google.inject.Provider
import groovy.transform.CompileStatic
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL

import javax.sql.DataSource

@CompileStatic
class DSLContextProvider implements Provider<DSLContext> {

    @Inject
    DataSource dataSource

    @Override
    DSLContext get() {
         DSL.using(dataSource, SQLDialect.MYSQL)
    }
}
