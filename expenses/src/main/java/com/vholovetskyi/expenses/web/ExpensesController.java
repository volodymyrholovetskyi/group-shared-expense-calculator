package com.vholovetskyi.expenses.web;

import com.vholovetskyi.expenses.application.port.ExpensesService;
import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.web.dto.CreateExpensesDto;
import com.vholovetskyi.expenses.web.dto.ResponseExpensesDto;
import com.vholovetskyi.expenses.web.mapper.ExpensesDtoMapper;
import com.vholovetskyi.expenses.web.mapper.ExpensesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@RequiredArgsConstructor
public class ExpensesController {

    private final ExpensesService expensesService;
    private final ExpensesMapper expensesMapper;
    private final ExpensesDtoMapper expensesDtoMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/event/{id}")
    List<ResponseExpensesDto> getListExpensesByIdEvent(@PathVariable Long id) {
        List<Expenses> expenses = expensesService.getListExpensesByIdEvent(id);
        return expenses.stream()
                .map(expensesDtoMapper::apply)
                .toList();
    }

    @PostMapping()
    void createExpenses(@RequestBody CreateExpensesDto expensesDto) {
        Expenses expenses = expensesMapper.apply(expensesDto);
        expensesService.createExpenses(expenses);
    }
}
