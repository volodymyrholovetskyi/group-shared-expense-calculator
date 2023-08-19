package com.vholovetskyi.expenses.db;

import com.vholovetskyi.expenses.domain.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpensesJpaRepository extends JpaRepository<Expenses, Long> {


    @Query("SELECT expenses FROM Expenses expenses WHERE expenses.eventId=:id")
    List<Expenses> getEventExpenses(@Param("id") Long eventId);
}
