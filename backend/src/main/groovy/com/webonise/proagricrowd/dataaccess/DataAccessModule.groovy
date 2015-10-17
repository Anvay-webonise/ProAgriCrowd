package com.webonise.proagricrowd.dataaccess

import com.google.inject.AbstractModule
import com.webonise.proagricrowd.dao.impl.UserDaoImpl
import com.webonise.proagricrowd.dao.interfaces.UserDao
import com.webonise.proagricrowd.dataaccess.providers.DSLContextProvider
import groovy.transform.CompileStatic
import org.jooq.DSLContext

import javax.naming.InitialContext
import javax.sql.DataSource

/**
 * Created by webonise on 14/8/15.
 */
@CompileStatic
class DataAccessModule extends AbstractModule {

    static final String DATASOURCE_JNDI= "java:comp/env/jdbc/mysqldatabase"

    @Override
    void configure() {
        def dataSource = InitialContext.doLookup(DATASOURCE_JNDI) as DataSource
        assert dataSource : "The datasource can not be null for JNDI ${DATASOURCE_JNDI}"
        bind(DataSource.class).toInstance(dataSource)
        bind(DSLContext.class).toProvider(DSLContextProvider.class)
        bind(UserDao).to(UserDaoImpl)
    }
}
