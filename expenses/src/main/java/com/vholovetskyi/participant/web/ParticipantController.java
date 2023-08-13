package com.vholovetskyi.participant.web;

import com.vholovetskyi.participant.application.port.ParticipantUseCase;
import com.vholovetskyi.participant.web.dto.RequestParticipantCommand;
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
    void createParticipant(@RequestBody RequestParticipantCommand requestParticipant) {
        participantService.createParticipant(requestParticipant.toCreateParticipantCommand());
    }
}
