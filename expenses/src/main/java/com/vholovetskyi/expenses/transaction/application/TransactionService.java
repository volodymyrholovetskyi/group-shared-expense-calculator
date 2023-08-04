package com.vholovetskyi.expenses.transaction.application;

import com.vholovetskyi.expenses.transaction.application.dto.CreateTransactionCommand;
import com.vholovetskyi.expenses.transaction.application.port.TransactionUseCase;
import com.vholovetskyi.expenses.transaction.db.TransactionJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService implements TransactionUseCase {

    private final TransactionJpaRepository transactionJpa;


    @Override
    public void createTransaction(CreateTransactionCommand command) {
        transactionJpa.save(command.toTransaction());
    }
}
