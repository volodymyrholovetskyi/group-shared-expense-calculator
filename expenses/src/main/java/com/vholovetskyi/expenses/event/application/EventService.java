package com.vholovetskyi.expenses.event.application;

import com.vholovetskyi.expenses.event.application.dto.CreateEventCommand;
import com.vholovetskyi.expenses.event.application.port.EventUseCase;
import com.vholovetskyi.expenses.event.db.EventJpaRepository;
import com.vholovetskyi.expenses.event.domain.Event;
import com.vholovetskyi.expenses.participant.application.port.ParticipantUseCase;
import com.vholovetskyi.expenses.participant.domain.Participant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EventService implements EventUseCase {

    private final EventJpaRepository eventRepository;
    private final ParticipantUseCase participantUseCase;

    @Override
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    @Override
    public void createEvent(CreateEventCommand eventCommand) {
        eventRepository.save(eventCommand.toEvent());
    }

    private List<Participant> getParticipantsByIds(final Set<Long> ids) {
        return participantUseCase.getParticipantByIds(ids);
    }
}
