package com.vholovetskyi.expenses.application.port;

import com.vholovetskyi.expenses.domain.Expenses;

import java.util.List;

public interface ExpensesService {
    List<Expenses> getListExpensesByIdEvent(Long id);

    void createExpenses(Expenses expensesDto);
}
