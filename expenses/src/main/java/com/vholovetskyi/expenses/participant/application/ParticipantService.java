package com.vholovetskyi.expenses.participant.application;

import com.vholovetskyi.expenses.participant.application.dto.CreateParticipantCommand;
import com.vholovetskyi.expenses.participant.application.port.ParticipantUseCase;
import com.vholovetskyi.expenses.participant.db.ParticipantJpaRepository;
import com.vholovetskyi.expenses.participant.domain.Participant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ParticipantService implements ParticipantUseCase {

    private final ParticipantJpaRepository participantRepository;
    @Override
    public void createParticipant(CreateParticipantCommand participantCommand) {
        participantRepository.save(participantCommand.toParticipant());
    }

    @Override
    public List<Participant> getParticipantByIds(Set<Long> ids) {
        return participantRepository.findAllById(ids);
    }
}
