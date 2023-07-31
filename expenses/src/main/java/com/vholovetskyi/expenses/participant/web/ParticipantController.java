package com.vholovetskyi.expenses.participant.web;

import com.vholovetskyi.expenses.event.web.dto.RequestEventCommand;
import com.vholovetskyi.expenses.participant.application.port.ParticipantUseCase;
import com.vholovetskyi.expenses.participant.web.dto.RequestParticipantCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("participants")
@RequiredArgsConstructor
public class ParticipantController {

    private final ParticipantUseCase participantService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    void createEvent(@RequestBody RequestParticipantCommand requestParticipant) {
        participantService.createParticipant(requestParticipant.toCreateParticipantCommand());
    }
}
