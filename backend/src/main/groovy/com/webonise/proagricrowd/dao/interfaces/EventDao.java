package com.webonise.proagricrowd.dao.interfaces;


import com.webonise.proagricrowd.sql.tables.pojos.Events;

import java.util.List;

public interface EventDao {

    List<Events> getListOfEvents();

    Events getEventById(int eventId);

    boolean createEvent(Events events);
}
