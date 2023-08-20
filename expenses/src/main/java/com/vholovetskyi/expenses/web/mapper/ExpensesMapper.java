package com.vholovetskyi.expenses.web.mapper;

import com.vholovetskyi.event.domain.Currency;
import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.domain.Money;
import com.vholovetskyi.expenses.domain.PayerID;
import com.vholovetskyi.expenses.domain.SplitType;
import com.vholovetskyi.expenses.web.dto.CreateExpensesDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ExpensesMapper implements Function<CreateExpensesDto, Expenses> {

    @Override
    public Expenses apply(CreateExpensesDto createExpenses) {
        return new Expenses(
                createExpenses.name(),
                createExpenses.category(),
                SplitType.EQUAL,
                createExpenses.eventId(),
                Money.createInAmount(
                        createExpenses.amount(),
                        Currency.parseString(createExpenses.currencyCode())
                ),
                PayerID.create(createExpenses.payerId())
        );
    }
}
