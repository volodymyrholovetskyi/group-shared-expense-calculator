package com.vholovetskyi.expenses.journey.application;

import com.vholovetskyi.expenses.journey.application.dto.CreateJourneyCommand;
import com.vholovetskyi.expenses.journey.application.port.EventUseCase;
import com.vholovetskyi.expenses.journey.db.JourneyJpaRepository;
import com.vholovetskyi.expenses.journey.domain.Journey;
import com.vholovetskyi.expenses.participant.application.port.ParticipantUseCase;
import com.vholovetskyi.expenses.journey.application.dto.CreateTransactionCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Journey getJourneyById(Long id) {
        return eventRepository.findById(id).orElseThrow();
    }

    @Override
    public void createEvent(CreateJourneyCommand eventCommand) {
        eventRepository.save(eventCommand.toEvent());
    }

    @Override
    public void addTransactionToJourney(CreateTransactionCommand command) {
        Journey journey = getJourneyById(command.journeyId());
        journey.addTransaction(command.toTransaction());
        eventRepository.save(journey);
    }
}
