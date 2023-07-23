package com.vholovetskyi.expenses.event.application.dto;

import com.vholovetskyi.expenses.event.domain.Currency;
import com.vholovetskyi.expenses.event.domain.Event;
import com.vholovetskyi.expenses.event.domain.EventStatus;
import com.vholovetskyi.expenses.participant.domain.Participant;

import java.time.LocalDate;
import java.util.Set;

public record CreateEventCommand(
        String name,

        String description,
        String currency,
        String status,
        Set<Participant> participants,
        LocalDate endDate
) {

    public Event toEvent() {
        return Event.builder()
                .name(name)
                .description(description)
                .currencyCode(Currency.of(currency))
                .status(EventStatus.ACTIVE)
                .participants(participants)
                .endDate(endDate)
                .build();
    }
}
