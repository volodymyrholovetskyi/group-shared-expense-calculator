package com.vholovetskyi.expenses.participant.application.dto;

import com.vholovetskyi.expenses.participant.domain.Participant;

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
