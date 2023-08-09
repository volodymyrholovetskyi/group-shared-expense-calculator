package com.vholovetskyi.event.domain;

import com.vholovetskyi.commons.jpa.BaseEntity;
import com.vholovetskyi.expenses.domain.Expenses;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
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

    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "event_id")
    private Set<Expenses> expenses = new HashSet<>();

    private LocalDate endDate;

    public void addExpenses(Expenses expenses) {
        this.expenses.add(expenses);
    }
}
