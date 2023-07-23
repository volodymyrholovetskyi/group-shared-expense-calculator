package com.vholovetskyi.expenses.event.application.port;

import com.vholovetskyi.expenses.event.application.dto.CreateEventCommand;
import com.vholovetskyi.expenses.event.domain.Event;

import java.util.List;

public interface EventUseCase {
    List<Event> getEvents();

    void createEvent(CreateEventCommand toCreateEventCommand);
}
