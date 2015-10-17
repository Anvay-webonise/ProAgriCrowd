package com.webonise.proagricrowd.dao.impl

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.ExpertDao
import com.webonise.proagricrowd.sql.tables.pojos.Individuals
import static com.webonise.proagricrowd.sql.tables.Individuals.INDIVIDUALS
import static com.webonise.proagricrowd.sql.tables.Users.USERS
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.jooq.DSLContext

@Slf4j
@CompileStatic
class ExpertDaoImpl implements ExpertDao{

    final DSLContext dslContext

    @Inject
    ExpertDaoImpl(DSLContext dslContext){
        this.dslContext = dslContext
    }

    @Override
    List<Individuals> getAllExpertDetails() {
        List<Individuals> expertList = new ArrayList<Individuals>()
        List<Integer> expertUserIdList = new ArrayList<Integer>()
        expertUserIdList = dslContext.select(USERS.USR_ID)
                .from(USERS)
                .where(USERS.USR_TYP_ID.eq(2))
                .fetch() as List<Integer>
        for (Integer id : expertUserIdList){
            expertList.add(dslContext.select()
                    .from(INDIVIDUALS)
                    .where(INDIVIDUALS.IND_ID.eq(id))
                    .fetch().into(INDIVIDUALS) as Individuals)
        }
        return  expertList
    }
}

