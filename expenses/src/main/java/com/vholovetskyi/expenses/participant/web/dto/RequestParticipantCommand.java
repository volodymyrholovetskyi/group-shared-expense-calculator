package com.vholovetskyi.expenses.participant.web.dto;

import com.vholovetskyi.expenses.participant.application.dto.CreateParticipantCommand;

public record RequestParticipantCommand(
        String name,
        String email
) {

    public CreateParticipantCommand toCreateParticipantCommand() {
        return new CreateParticipantCommand(name, email);
    }
}
