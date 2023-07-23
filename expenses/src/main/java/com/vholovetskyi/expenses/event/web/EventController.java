package com.vholovetskyi.expenses.event.web;

import com.vholovetskyi.expenses.event.application.port.EventUseCase;
import com.vholovetskyi.expenses.event.domain.Event;
import com.vholovetskyi.expenses.event.web.dto.RequestEventCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("events")
@RequiredArgsConstructor
public class EventController {

    private final EventUseCase eventUseCase;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    List<Event> getEvents() {
        return eventUseCase.getEvents();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    void createEvent(@RequestBody RequestEventCommand requestEvent) {
         eventUseCase.createEvent(requestEvent.toCreateEventCommand());
    }
}
