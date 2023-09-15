package com.ai.codegeneration.sig.example.api;

import com.ai.codegeneration.sig.example.generated.api.TransactionsApiDelegate;
import com.ai.codegeneration.sig.example.generated.model.Transaction;
import com.ai.codegeneration.sig.example.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransactionsApiDelegateImpl implements TransactionsApiDelegate {
    @Autowired
    private TransactionService transactionService;

    @Override
    public ResponseEntity<Transaction> checkout(Transaction transaction) {
        // call TransactionService to create a transaction
        Transaction transactionDto = transactionService.createTransaction(transaction);
        return ResponseEntity.ok(transactionDto);
    }

    @Override
    public ResponseEntity<List<Transaction>> getAllTransactions(Integer cardId) {
        // call TransactionService to get all transactions for a cardId
        List<Transaction> transactionDto = transactionService.getTransactionsByCardId(cardId);
        return ResponseEntity.ok(transactionDto);
    }

    @Override
    public ResponseEntity<Transaction> getTransactionById(Integer transactionId) {

        Transaction transactionDto = transactionService.getTransactionById(transactionId);
        return ResponseEntity.ok(transactionDto);
    }
}
