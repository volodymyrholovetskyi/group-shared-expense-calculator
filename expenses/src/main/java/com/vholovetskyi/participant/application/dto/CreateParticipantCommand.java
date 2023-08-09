package com.vholovetskyi.participant.application.dto;

import com.vholovetskyi.participant.domain.Participant;

public record CreateParticipantCommand(
        String name,
        String email
) {

    public Participant toParticipant() {
        return Participant.builder()
                .name(name)
                .email(email)
                .build();
    }
}
