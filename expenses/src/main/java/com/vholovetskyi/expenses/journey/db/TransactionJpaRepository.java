package com.vholovetskyi.expenses.journey.db;

import com.vholovetskyi.expenses.journey.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionJpaRepository extends JpaRepository<Transaction, Long> {
}
