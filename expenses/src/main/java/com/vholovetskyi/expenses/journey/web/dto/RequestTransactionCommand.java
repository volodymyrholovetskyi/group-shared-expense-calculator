package com.vholovetskyi.expenses.journey.web.dto;

import com.vholovetskyi.expenses.journey.application.dto.CreateTransactionCommand;

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
