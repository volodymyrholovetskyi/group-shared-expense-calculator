package com.vholovetskyi.expenses.domain;


import com.vholovetskyi.commons.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Expenses extends BaseEntity {
    private String name;
    private String category;
    @Enumerated(value = EnumType.STRING)
    private SplitType split;
    @Column(name = "event_id")
    private Long eventId;
    @Embedded
    private Money amount;
    @Embedded
    private PayerId payerId;

    public BigDecimal getAmount() {
        return amount.getAmount();
    }

    public String getCurrencyCode() {
        return amount.getCurrencyCode().toString();
    }
}
