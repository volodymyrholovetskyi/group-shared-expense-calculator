package com.vholovetskyi.expenses.application.port;

import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.web.dto.CreateExpensesDto;
import com.vholovetskyi.expenses.web.dto.ResponseExpensesDto;

import java.util.List;

public interface ExpensesService {
    List<ResponseExpensesDto> getEventExpenses(Long id);

    void createExpenses(CreateExpensesDto expensesDto);
}
