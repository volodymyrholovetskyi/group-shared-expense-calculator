package com.vholovetskyi.expenses.participant.application.port;

import com.vholovetskyi.expenses.participant.application.dto.CreateParticipantCommand;
import com.vholovetskyi.expenses.participant.domain.Participant;

import java.util.List;
import java.util.Set;

public interface ParticipantUseCase {
    void createParticipant(CreateParticipantCommand participantCommand);

    List<Participant> getParticipantByIds(Set<Long> ids);
}
