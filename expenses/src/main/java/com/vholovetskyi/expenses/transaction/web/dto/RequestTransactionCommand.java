package com.vholovetskyi.expenses.transaction.web.dto;

import com.vholovetskyi.expenses.transaction.application.dto.CreateTransactionCommand;

import java.math.BigDecimal;

public record RequestTransactionCommand(
        String name,
        String category,
        String split,
        Long journeyId,
        BigDecimal amount
) {

    public CreateTransactionCommand toCreateTransactionCommand() {
        return new CreateTransactionCommand(
                name,
                category,
                split,
                journeyId,
                amount
        );
    }
}
