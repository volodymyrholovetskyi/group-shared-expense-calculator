package com.vholovetskyi.expenses.event.web.dto;

import com.vholovetskyi.expenses.event.application.dto.CreateEventCommand;
import com.vholovetskyi.expenses.participant.domain.Participant;

import java.time.LocalDate;
import java.util.Set;

public record RequestEventCommand(
        String name,

        String description,
        String currency,
        String status,
        Set<Long> participantIds,
        LocalDate endDate

) {

    public CreateEventCommand toCreateEventCommand() {
        return new CreateEventCommand(
                name,
                description,
                currency,
                status,
                participantIds,
                endDate
        );
    }
}
