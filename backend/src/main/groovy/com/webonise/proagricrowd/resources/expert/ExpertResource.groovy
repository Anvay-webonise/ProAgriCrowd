package com.webonise.proagricrowd.resources.expert

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.ExpertDao
import com.webonise.proagricrowd.sql.tables.pojos.Individuals
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.resource.Get
import org.restlet.resource.ServerResource

@Slf4j
@CompileStatic
class ExpertResource extends ServerResource{

    final ExpertDao expertDao

    @Inject
    ExpertResource(ExpertDao expertDao){
        this.expertDao = expertDao
    }

    @Get
    List<Individuals> doGetExpertsList(){
        return expertDao.allExpertDetails
    }
}
