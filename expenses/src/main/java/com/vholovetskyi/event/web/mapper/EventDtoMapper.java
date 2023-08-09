package com.vholovetskyi.event.web.mapper;

import com.vholovetskyi.event.domain.Event;
import com.vholovetskyi.event.web.dto.ResponseEventDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class EventDtoMapper implements Function<Event, ResponseEventDto> {

    @Override
    public ResponseEventDto apply(Event event) {
        return new ResponseEventDto(
                event.getId(),
                event.getName(),
                event.getDescription(),
                event.getCurrencyCode().toString(),
                event.getStatus().toString()
        );
    }
}
