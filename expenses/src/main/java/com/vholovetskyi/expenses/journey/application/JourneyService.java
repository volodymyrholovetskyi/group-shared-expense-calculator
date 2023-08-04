package com.vholovetskyi.expenses.journey.application;

import com.vholovetskyi.expenses.journey.application.dto.CreateJourneyCommand;
import com.vholovetskyi.expenses.journey.application.port.EventUseCase;
import com.vholovetskyi.expenses.journey.db.JourneyJpaRepository;
import com.vholovetskyi.expenses.journey.domain.Journey;
import com.vholovetskyi.expenses.participant.application.port.ParticipantUseCase;
import com.vholovetskyi.expenses.participant.domain.Participant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class JourneyService implements EventUseCase {

    private final JourneyJpaRepository eventRepository;
    private final ParticipantUseCase participantUseCase;

    @Override
    public List<Journey> getEvents() {
        return eventRepository.findAll();
    }

    @Override
    public void createEvent(CreateJourneyCommand eventCommand) {
        eventRepository.save(eventCommand.toEvent());
    }

    private List<Participant> getParticipantsByIds(final Set<Long> ids) {
        return participantUseCase.getParticipantByIds(ids);
    }
}
