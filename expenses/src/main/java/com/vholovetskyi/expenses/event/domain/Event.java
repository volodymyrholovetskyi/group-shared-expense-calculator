package com.vholovetskyi.expenses.event.domain;

import com.vholovetskyi.expenses.commons.jpa.BaseEntity;
import com.vholovetskyi.expenses.transaction.domain.Transaction;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Event extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;
    private String description;

    @Enumerated(value = EnumType.STRING)
    private Currency currencyCode;
    @Enumerated(value = EnumType.STRING)
    private EventStatus status;

    @OneToMany(mappedBy = "event")
    private Set<Transaction> transactions = new HashSet<>();

//    @OneToMany
//    @JoinColumn(name = "participant_id")
//    private Set<Participant> participants = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "event_participant_ids", joinColumns = @JoinColumn(name = "event_id"))
    private Set<ParticipantIds> participantIds = new HashSet<>();
    private LocalDate endDate;

    public void addParticipantIds(Set<ParticipantIds> participantsIds) {
        participantIds.addAll(participantsIds);
    }
}
