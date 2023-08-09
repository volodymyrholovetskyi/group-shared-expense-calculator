package com.vholovetskyi.event.application.port;

import com.vholovetskyi.event.domain.Event;

import java.util.List;

public interface EventService {
    List<Event> getListEvents();
    Event getEventById(Long id);
    void createEvent(Event toCreateEventDto);

}
