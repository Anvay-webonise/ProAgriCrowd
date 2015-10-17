package com.webonise.proagricrowd.dataaccess

import com.google.inject.AbstractModule
import com.webonise.proagricrowd.dao.impl.EventDaoImpl
import com.webonise.proagricrowd.dao.interfaces.EventDao
import com.webonise.proagricrowd.dataaccess.providers.DSLContextProvider
import groovy.transform.CompileStatic
import org.jooq.DSLContext

import javax.naming.InitialContext
import javax.sql.DataSource

@CompileStatic
class DataAccessModule extends AbstractModule {

    static final String DATASOURCE_JNDI = "java:comp/env/jdbc/mysqldatabase"

    @Override
    void configure() {
        def dataSource = InitialContext.doLookup(DATASOURCE_JNDI) as DataSource
        assert dataSource: "The datasource can not be null for JNDI ${DATASOURCE_JNDI}"
        bind(DataSource).toInstance(dataSource)
        bind(DSLContext).toProvider(DSLContextProvider)
        bind(EventDao).to(EventDaoImpl)
    }
}
