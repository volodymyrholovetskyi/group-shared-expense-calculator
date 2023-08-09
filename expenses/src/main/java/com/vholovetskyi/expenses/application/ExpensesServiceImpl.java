package com.vholovetskyi.expenses.application;

import com.vholovetskyi.event.application.port.EventService;
import com.vholovetskyi.event.domain.Event;
import com.vholovetskyi.expenses.application.port.ExpensesService;
import com.vholovetskyi.expenses.db.ExpensesJpaRepository;
import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.web.dto.ResponseExpensesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpensesServiceImpl implements ExpensesService {
    private final EventService eventService;
    private final ExpensesJpaRepository expensesJpa;

    @Override
    public List<Expenses> getListExpensesByIdEvent(Long eventId) {
        return expensesJpa.findAllExpensesByIdEvent(eventId);
    }
    @Override
    public void createExpenses(Expenses expenses) {
        Event event = getEventById(expenses.getEventId());
        event.addExpenses(expenses);
        eventService.createEvent(event);
    }

    private Event getEventById(Long id) {
        return eventService
                .getEventById(id);
    }
}
