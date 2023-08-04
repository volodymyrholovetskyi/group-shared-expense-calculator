package com.vholovetskyi.expenses.journey.domain;

import com.vholovetskyi.expenses.commons.jpa.BaseEntity;
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
public class Journey extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;
    private String description;

    @Enumerated(value = EnumType.STRING)
    private Currency currencyCode;
    @Enumerated(value = EnumType.STRING)
    private JourneyStatus status;

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "journey_id")
    private Set<Transaction> transactions = new HashSet<>();

    private LocalDate endDate;

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }

}
