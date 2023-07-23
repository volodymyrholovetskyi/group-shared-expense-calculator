package com.vholovetskyi.expenses.event.domain;

import com.vholovetskyi.expenses.commons.jpa.BaseEntity;
import com.vholovetskyi.expenses.participant.domain.Participant;
import com.vholovetskyi.expenses.transaction.domain.Transaction;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
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
    private Set<Transaction> transactions;

    @OneToMany
    @JoinColumn(name = "participant_id")
    private Set<Participant> participants;
    private LocalDate endDate;

}
