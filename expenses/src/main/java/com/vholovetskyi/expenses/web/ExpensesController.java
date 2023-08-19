package com.vholovetskyi.expenses.web;

import com.vholovetskyi.expenses.application.port.ExpensesService;
import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.web.dto.CreateExpensesDto;
import com.vholovetskyi.expenses.web.dto.ResponseExpensesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
@RequiredArgsConstructor
public class ExpensesController {

    private final ExpensesService expensesService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/event/{id}")
    List<ResponseExpensesDto> getEventExpenses(@PathVariable Long id) {
        return expensesService.getEventExpenses(id);
    }

    @PostMapping()
    void createExpenses(@RequestBody CreateExpensesDto expensesDto) {
        expensesService.createExpenses(expensesDto);
    }
}
