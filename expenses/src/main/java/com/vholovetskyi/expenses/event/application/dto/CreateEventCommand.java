package com.vholovetskyi.expenses.event.application.dto;

import com.vholovetskyi.expenses.event.domain.Currency;
import com.vholovetskyi.expenses.event.domain.Event;
import com.vholovetskyi.expenses.event.domain.EventStatus;
import com.vholovetskyi.expenses.event.domain.ParticipantIds;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public record CreateEventCommand(
        String name,

        String description,
        String currency,
        String status,
        Set<Long> participantIds,
        LocalDate endDate
) {

    public Event toEvent() {
        Event event = Event.builder()
                .name(name)
                .description(description)
                .currencyCode(Currency.of(currency))
                .status(EventStatus.ACTIVE)
                .endDate(endDate)
                .build();

        if (Objects.nonNull(participantIds) && !participantIds.isEmpty()) {
            Set<ParticipantIds> participantsIds = participantIds.stream()
                    .map(ParticipantIds::create)
                    .collect(Collectors.toSet());
            event.addParticipantIds(participantsIds);
        }
        return event;
    }
}
