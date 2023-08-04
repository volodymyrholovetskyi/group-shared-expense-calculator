package com.vholovetskyi.expenses.journey.web.dto;

import com.vholovetskyi.expenses.journey.application.dto.CreateJourneyCommand;

import java.time.LocalDate;
import java.util.Set;

public record RequestJourneyCommand(
        String name,

        String description,
        String currency,
        String status,
        LocalDate endDate

) {

    public CreateJourneyCommand toCreateEventCommand() {
        return new CreateJourneyCommand(
                name,
                description,
                currency,
                status,
                endDate
        );
    }
}
