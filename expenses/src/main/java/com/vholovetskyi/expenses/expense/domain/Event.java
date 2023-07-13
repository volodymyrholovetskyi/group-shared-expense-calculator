package com.vholovetskyi.expenses.expense.domain;

import com.vholovetskyi.expenses.commons.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event extends BaseEntity {
    private String name;
    private String description;
    private Currency currency;
    private EventStatus status;
    private Set<Transaction> transactions;
    private Set<Long> participantIds;
    private LocalDate endDate;

}
