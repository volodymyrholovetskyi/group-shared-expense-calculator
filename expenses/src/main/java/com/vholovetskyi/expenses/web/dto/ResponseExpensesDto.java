package com.vholovetskyi.expenses.web.dto;

import java.math.BigDecimal;

public record ResponseExpensesDto(
        Long id,
        String name,
        String category,
        String split,
        BigDecimal amount,
        String currencyCode
) {
}
