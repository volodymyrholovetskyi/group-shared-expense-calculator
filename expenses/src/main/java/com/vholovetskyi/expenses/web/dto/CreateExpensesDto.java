package com.vholovetskyi.expenses.web.dto;

import com.vholovetskyi.event.domain.Currency;
import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.domain.Money;
import com.vholovetskyi.expenses.domain.SplitType;

import java.math.BigDecimal;

public record CreateExpensesDto(
        String name,
        String category,
        String split,
        String currencyCode,
        BigDecimal amount,
        Long eventId,
        Long payerId
) {
}
