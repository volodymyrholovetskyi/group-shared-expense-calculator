package com.vholovetskyi.expenses.journey.application.dto;

import com.vholovetskyi.expenses.journey.domain.Currency;
import com.vholovetskyi.expenses.journey.domain.Journey;
import com.vholovetskyi.expenses.journey.domain.JourneyStatus;

import java.time.LocalDate;
import java.util.Set;

public record CreateJourneyCommand(
        String name,

        String description,
        String currency,
        String status,
        LocalDate endDate
) {

    public Journey toEvent() {
        return Journey.builder()
                .name(name)
                .description(description)
                .currencyCode(Currency.of(currency))
                .status(JourneyStatus.ACTIVE)
                .endDate(endDate)
                .build();
    }
}
