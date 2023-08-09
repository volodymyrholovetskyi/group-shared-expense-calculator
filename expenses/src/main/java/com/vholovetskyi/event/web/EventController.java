package com.vholovetskyi.event.web;

import com.vholovetskyi.event.application.port.EventService;
import com.vholovetskyi.event.domain.Event;
import com.vholovetskyi.event.web.dto.CreateEventDto;
import com.vholovetskyi.event.web.dto.ResponseEventDto;
import com.vholovetskyi.event.web.mapper.EventMapper;
import com.vholovetskyi.event.web.mapper.EventDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;
    private final EventMapper eventMapper;
    private final EventDtoMapper eventDtoMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    List<ResponseEventDto> getEvents() {
        return eventService.getListEvents()
                .stream()
                .map(eventDtoMapper::apply)
                .toList();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    void createEvent(@RequestBody CreateEventDto eventDto) {
        Event event = eventMapper.apply(eventDto);
        eventService.createEvent(event);
    }
}
