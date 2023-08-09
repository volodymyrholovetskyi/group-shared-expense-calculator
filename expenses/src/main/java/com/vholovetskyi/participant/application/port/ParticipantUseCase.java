package com.vholovetskyi.participant.application.port;

import com.vholovetskyi.participant.application.dto.CreateParticipantCommand;
import com.vholovetskyi.participant.domain.Participant;

import java.util.List;
import java.util.Set;

public interface ParticipantUseCase {
    void createParticipant(CreateParticipantCommand participantCommand);

    List<Participant> getParticipantByIds(Set<Long> ids);
}
