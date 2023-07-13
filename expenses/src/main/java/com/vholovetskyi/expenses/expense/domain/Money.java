package com.vholovetskyi.expenses.expense.domain;

import com.vholovetskyi.expenses.exceptions.ExceptionError;
import com.vholovetskyi.expenses.exceptions.IncorrectMoneyException;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
public class Money {
    private BigDecimal amount;
    private Currency currency;

    private Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money create(BigDecimal amount, Currency currency) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IncorrectMoneyException(ExceptionError.MONEY_ZERO_OR_NEGATIVE);
        }
        return new Money(amount, currency);
    }
}
