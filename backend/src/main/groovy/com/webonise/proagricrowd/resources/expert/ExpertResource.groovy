package com.webonise.proagricrowd.resources.expert

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.ExpertDao
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.resource.Get
import org.restlet.resource.ServerResource

@Slf4j
@CompileStatic
class ExpertResource extends ServerResource{

    @Inject
    ExpertDao expertDao



}
