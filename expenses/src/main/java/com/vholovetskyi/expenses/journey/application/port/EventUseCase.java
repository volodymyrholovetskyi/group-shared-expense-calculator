package com.vholovetskyi.expenses.journey.application.port;

import com.vholovetskyi.expenses.journey.application.dto.CreateJourneyCommand;
import com.vholovetskyi.expenses.journey.domain.Journey;

import java.util.List;

public interface EventUseCase {
    List<Journey> getEvents();

    void createEvent(CreateJourneyCommand toCreateJourneyCommand);
}
