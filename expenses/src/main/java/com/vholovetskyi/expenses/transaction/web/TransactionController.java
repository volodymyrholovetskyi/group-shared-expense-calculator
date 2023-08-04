package com.vholovetskyi.expenses.transaction.web;

import com.vholovetskyi.expenses.transaction.application.port.TransactionUseCase;
import com.vholovetskyi.expenses.transaction.db.TransactionJpaRepository;
import com.vholovetskyi.expenses.transaction.web.dto.RequestTransactionCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("transactions")
public class TransactionController {

    private final TransactionUseCase transactionService;

    @PostMapping
    void createTransaction(@RequestBody RequestTransactionCommand command) {
        transactionService.createTransaction(command.toCreateTransactionCommand());
    }
}
