package com.vholovetskyi.event.web.dto;

import com.vholovetskyi.event.domain.Currency;
import com.vholovetskyi.event.domain.Event;
import com.vholovetskyi.event.domain.EventStatus;

import java.time.LocalDate;

public record CreateEventDto(
        String name,
        String description,
        String currency,
        String status,
        LocalDate endDate
) {
}
