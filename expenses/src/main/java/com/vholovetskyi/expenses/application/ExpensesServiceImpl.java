package com.vholovetskyi.expenses.application;

import com.vholovetskyi.event.application.port.EventService;
import com.vholovetskyi.event.domain.Event;
import com.vholovetskyi.expenses.application.port.ExpensesService;
import com.vholovetskyi.expenses.db.ExpensesJpaRepository;
import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.domain.factory.ExpensesFactory;
import com.vholovetskyi.expenses.web.dto.CreateExpensesDto;
import com.vholovetskyi.expenses.web.dto.ResponseExpensesDto;
import com.vholovetskyi.expenses.web.mapper.ExpensesDtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesServiceImpl implements ExpensesService {
    private final EventService eventService;
    private final ExpensesJpaRepository expensesJpa;
    private final ExpensesDtoMapper expensesDtoMapper;

    public ExpensesServiceImpl(
            EventService eventService,
            ExpensesJpaRepository repository,
            ExpensesDtoMapper expensesDtoMapper) {
        this.eventService = eventService;
        this.expensesJpa = repository;
        this.expensesDtoMapper = expensesDtoMapper;
    }

    @Override
    public List<ResponseExpensesDto> getEventExpenses(Long eventId) {
        return expensesJpa.getEventExpenses(eventId)
                .stream()
                .map(expensesDtoMapper)
                .toList();
    }
    @Override
    public void createExpenses(CreateExpensesDto expenses) {
        Event event = getEventById(expenses.eventId());
        Expenses newExpenses= ExpensesFactory.createExpenses(expenses);
        event.addExpenses(newExpenses);
        eventService.createEvent(event);
    }

    private Event getEventById(Long id) {
        return eventService
                .getEventById(id);
    }
}
