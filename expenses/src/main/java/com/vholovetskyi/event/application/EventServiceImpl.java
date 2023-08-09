package com.vholovetskyi.event.application;

import com.vholovetskyi.event.application.port.EventService;
import com.vholovetskyi.event.domain.Event;
import com.vholovetskyi.event.db.EventJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventJpaRepository eventRepository;

    @Override
    public List<Event> getListEvents() {
//        return eventRepository.findAll();
        return eventRepository.getFetchEvents();
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElseThrow();
    }

    @Override
    public void createEvent(Event event) {
        eventRepository.save(event);
    }
}
