package com.webonise.proagricrowd.dao.impl

import com.google.inject.Inject
import com.webonise.proagricrowd.dao.interfaces.EventDao
import com.webonise.proagricrowd.exceptions.NoContentFoundException
import com.webonise.proagricrowd.sql.tables.pojos.Events
import groovy.transform.CompileStatic
import org.jooq.DSLContext

import static com.webonise.proagricrowd.sql.Tables.EVENTS

@CompileStatic
class EventDaoImpl implements EventDao {

    private final DSLContext dslContext

    @Inject
    EventDaoImpl(DSLContext dslContext) {
        this.dslContext = dslContext

    }

    @Override
    List<Events> getListOfEvents() {
        def listOfEvents = this.dslContext.select().from(EVENTS).fetch()
        if (!listOfEvents) {
            return Collections.emptyList()
        }
        return listOfEvents.into(Events)
    }

    @Override
    Events getEventById(int eventId) {
        def event = this.dslContext.select().from(EVENTS).where(EVENTS.EVENT_ID.eq(eventId)).fetchOne()
        if (!event) {
            throw new NoContentFoundException("No records found for event id ${eventId}");
        }
        return event.into(Events)
    }

    @Override
    boolean createEvent(Events events) {
        int records = this.dslContext.newRecord(EVENTS, Events).store()
        if (records > 0) {
            return true
        }
        return false
    }
}
