package com.vholovetskyi.expenses.domain.factory;

import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.web.dto.CreateExpensesDto;

public interface ExpensesSplit {

    Expenses create(CreateExpensesDto expenses);

}
