package com.vholovetskyi.expenses.domain.factory;

import com.vholovetskyi.event.domain.Currency;
import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.domain.Money;
import com.vholovetskyi.expenses.domain.PayerID;
import com.vholovetskyi.expenses.domain.SplitType;
import com.vholovetskyi.expenses.web.dto.CreateExpensesDto;

public class ExpensesEqual implements ExpensesSplit{
    @Override
    public Expenses create(CreateExpensesDto expenses) {
        return new Expenses(
                expenses.name(),
                expenses.category(),
                SplitType.EQUAL,
                expenses.eventId(),
                Money.createInAmount(expenses.amount(), Currency.parseString(expenses.currencyCode())),
                PayerID.create(expenses.payerId())
        );
    }
}
