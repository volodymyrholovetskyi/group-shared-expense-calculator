package com.vholovetskyi.expenses.expense.domain;


import com.vholovetskyi.expenses.commons.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction extends BaseEntity {
    private String name;
    private String category;
    @Enumerated(value = EnumType.STRING)
    private SplitType split;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
    @Embedded
    private Money amount;
    private Long payerId;

}
