package com.vholovetskyi.expenses.transaction.db;

import com.vholovetskyi.expenses.transaction.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionJpaRepository extends JpaRepository<Transaction, Long> {
}
