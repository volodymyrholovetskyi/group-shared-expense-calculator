package com.vholovetskyi.expenses.transaction.application.port;

import com.vholovetskyi.expenses.transaction.application.dto.CreateTransactionCommand;

public interface TransactionUseCase {

    void createTransaction(CreateTransactionCommand command);
}
