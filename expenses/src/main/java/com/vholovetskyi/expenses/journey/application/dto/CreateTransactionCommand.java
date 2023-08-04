package com.vholovetskyi.expenses.journey.application.dto;

import com.vholovetskyi.expenses.journey.domain.Currency;
import com.vholovetskyi.expenses.journey.domain.Money;
import com.vholovetskyi.expenses.journey.domain.SplitType;
import com.vholovetskyi.expenses.journey.domain.Transaction;

import java.math.BigDecimal;

public record CreateTransactionCommand(
        String name,
        String category,
        String split,
        Long journeyId,
        BigDecimal amount
) {

    public Transaction toTransaction() {
        return new Transaction(
                name,
                category,
                SplitType.EQUAL,
                journeyId,
                Money.create(amount, Currency.EUR)
        );
    }
}
