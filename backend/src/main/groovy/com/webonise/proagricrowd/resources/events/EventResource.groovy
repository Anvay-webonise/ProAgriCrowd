package com.webonise.proagricrowd.resources.events

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.EventDao
import com.webonise.proagricrowd.sql.tables.pojos.Events
import groovy.transform.CompileStatic
import org.restlet.resource.Get
import org.restlet.resource.Post
import org.restlet.resource.ServerResource

@CompileStatic
class EventResource extends ServerResource{

    final EventDao eventDao

    @Inject
    EventResource(EventDao eventDao){
        this.eventDao = eventDao
    }

    @Get
    List<Events> doGetEvents(){
        return eventDao.listOfEvents
    }

    @Post
    boolean doCreateEvent(Events event){
        return eventDao.createEvent(event)
    }
}
