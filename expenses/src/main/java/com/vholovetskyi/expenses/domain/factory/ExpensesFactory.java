package com.vholovetskyi.expenses.domain.factory;

import com.vholovetskyi.expenses.domain.Expenses;
import com.vholovetskyi.expenses.domain.SplitType;
import com.vholovetskyi.expenses.web.dto.CreateExpensesDto;

import static com.vholovetskyi.expenses.domain.SplitType.*;

public class ExpensesFactory {

    private ExpensesFactory() {
        throw new UnsupportedOperationException();
    }

    public static Expenses createExpenses(CreateExpensesDto expenses){
        SplitType split = of(expenses.split());
        return switch (split) {
            case EQUAL -> new ExpensesEqual().create(expenses);
            case UNEQUAL -> new ExpensesUnequal().create(expenses);
            case PERCENT -> new ExpensesPercent().create(expenses);
        };
    }
}
