package com.vholovetskyi.expenses.web.mapper;

import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.web.dto.ResponseExpensesDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ExpensesDtoMapper implements Function<Expenses, ResponseExpensesDto> {
    @Override
    public ResponseExpensesDto apply(Expenses expenses) {
        return new ResponseExpensesDto(
                expenses.getId(),
                expenses.getName(),
                expenses.getCategory(),
                expenses.getSplit().toString(),
                expenses.getAmount(),
                expenses.getCurrencyCode()
        );
    }
}
