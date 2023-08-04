package com.vholovetskyi.expenses.journey.application.port;

import com.vholovetskyi.expenses.journey.application.dto.CreateJourneyCommand;
import com.vholovetskyi.expenses.journey.domain.Journey;
import com.vholovetskyi.expenses.journey.application.dto.CreateTransactionCommand;

import java.util.List;

public interface EventUseCase {
    List<Journey> getEvents();

    Journey getJourneyById(Long id);

    void createEvent(CreateJourneyCommand toCreateJourneyCommand);

    void addTransactionToJourney(CreateTransactionCommand command);
}
