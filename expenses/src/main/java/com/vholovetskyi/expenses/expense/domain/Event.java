package com.vholovetskyi.expenses.expense.domain;

import com.vholovetskyi.expenses.commons.BaseEntity;
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

    @ElementCollection
    @Column(name = "participant_ids")
    private Set<Long> participantIds;
    private LocalDate endDate;

}
