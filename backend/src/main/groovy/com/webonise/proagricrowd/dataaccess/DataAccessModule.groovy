package com.webonise.proagricrowd.dataaccess

import com.google.inject.AbstractModule
<<<<<<< HEAD
import com.webonise.proagricrowd.dao.impl.EventDaoImpl
import com.webonise.proagricrowd.dao.interfaces.EventDao
=======
import com.webonise.proagricrowd.dao.impl.UserDaoImpl
import com.webonise.proagricrowd.dao.interfaces.UserDao
>>>>>>> 0e1616f020f5c1a8032425b1dbab8844b6fa3164
import com.webonise.proagricrowd.dataaccess.providers.DSLContextProvider
import com.webonise.proagricrowd.sql.tables.pojos.Events
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
