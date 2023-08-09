package com.vholovetskyi.participant.web.dto;

import com.vholovetskyi.participant.application.dto.CreateParticipantCommand;

public record RequestParticipantCommand(
        String name,
        String email
) {

    public CreateParticipantCommand toCreateParticipantCommand() {
        return new CreateParticipantCommand(name, email);
    }
}
