package com.vholovetskyi.event.web.mapper;

import com.vholovetskyi.event.domain.Currency;
import com.vholovetskyi.event.domain.Event;
import com.vholovetskyi.event.domain.EventStatus;
import com.vholovetskyi.event.web.dto.CreateEventDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class EventMapper implements Function<CreateEventDto, Event> {

    @Override
    public Event apply(CreateEventDto createEvent) {
        return Event.builder()
                .name(createEvent.name())
                .description(createEvent.description())
                .status(EventStatus.ACTIVE)
                .currencyCode(Currency.parseString(createEvent.currency()))
                .endDate(createEvent.endDate())
                .build();
    }
}
