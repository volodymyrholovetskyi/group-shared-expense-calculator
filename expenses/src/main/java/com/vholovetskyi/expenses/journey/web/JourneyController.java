package com.vholovetskyi.expenses.journey.web;

import com.vholovetskyi.expenses.journey.application.port.EventUseCase;
import com.vholovetskyi.expenses.journey.domain.Journey;
import com.vholovetskyi.expenses.journey.web.dto.RequestJourneyCommand;
import com.vholovetskyi.expenses.journey.web.dto.RequestTransactionCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("events")
@RequiredArgsConstructor
public class JourneyController {

    private final EventUseCase eventUseCase;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    List<Journey> getEvents() {
        return eventUseCase.getEvents();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    void createEvent(@RequestBody RequestJourneyCommand requestEvent) {
         eventUseCase.createEvent(requestEvent.toCreateEventCommand());
    }

    @PutMapping("/transactions")
    void addTransactionToJourney(@RequestBody RequestTransactionCommand command) {
        eventUseCase.addTransactionToJourney(command.toCreateTransactionCommand());
    }
}
