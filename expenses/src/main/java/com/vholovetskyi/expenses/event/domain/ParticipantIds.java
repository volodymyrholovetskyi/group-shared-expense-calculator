package com.vholovetskyi.expenses.event.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParticipantIds {
    private Long participantId;

    public static ParticipantIds create(final Long participant) {
        return new ParticipantIds(participant);
    }
}
