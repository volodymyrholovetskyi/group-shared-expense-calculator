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
import java.text.NumberFormat;

@NoArgsConstructor
@Embeddable
@Getter
public class Money {

    private static final BigDecimal HUNDRED = new BigDecimal("100");
    private BigDecimal amount;

    @Enumerated(value = EnumType.STRING)
    private Currency currencyCode;

    private Money(BigDecimal amount, Currency currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public static Money createInAmount(BigDecimal amount, Currency currency) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IncorrectMoneyException(ExceptionError.INCORRECT_AMOUNT);
        }
        return new Money(amount, currency);
    }

    public static Money createInPercent(BigDecimal percent, Currency currency) {
        if (percent.compareTo(BigDecimal.ZERO) <= 0
                && percent.compareTo(HUNDRED) < 0) {
            throw new IncorrectMoneyException(ExceptionError.INCORRECT_PERCENT);
        }
        return new Money(percent, currency);
    }
}
