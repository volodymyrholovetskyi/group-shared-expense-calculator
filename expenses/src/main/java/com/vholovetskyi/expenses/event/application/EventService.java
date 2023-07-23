package com.vholovetskyi.expenses.event.application;

import com.vholovetskyi.expenses.event.application.dto.CreateEventCommand;
import com.vholovetskyi.expenses.event.application.port.EventUseCase;
import com.vholovetskyi.expenses.event.db.EventJpaRepository;
import com.vholovetskyi.expenses.event.domain.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService implements EventUseCase {

    private final EventJpaRepository eventRepository;

    @Override
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    @Override
    public void createEvent(CreateEventCommand eventCommand) {
        eventRepository.save(eventCommand.toEvent());
    }
}
