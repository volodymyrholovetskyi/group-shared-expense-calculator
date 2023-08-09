package com.vholovetskyi.expenses.domain;

import com.vholovetskyi.commons.exceptions.ExceptionError;
import com.vholovetskyi.commons.exceptions.IncorrectMoneyException;
import com.vholovetskyi.event.domain.Currency;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Embeddable
@Getter
public class Money {
    private BigDecimal amount;

    @Enumerated(value = EnumType.STRING)
    private Currency currencyCode;

    private Money(BigDecimal amount, Currency currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public static Money create(BigDecimal amount, Currency currency) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IncorrectMoneyException(ExceptionError.MONEY_ZERO_OR_NEGATIVE);
        }
        return new Money(amount, currency);
    }

}
