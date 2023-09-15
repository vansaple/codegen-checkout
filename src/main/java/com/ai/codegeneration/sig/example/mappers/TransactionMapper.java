package com.ai.codegeneration.sig.example.mappers;

import com.ai.codegeneration.sig.example.entities.TransactionEntity;
import com.ai.codegeneration.sig.example.generated.model.Transaction;
import org.springframework.beans.BeanUtils;

public class TransactionMapper {
    // Method that maps a TransactionEntity to a Transaction object
    public static Transaction mapTransactionEntityToTransaction(TransactionEntity transactionEntity) {
        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionEntity, transaction);

        return transaction;
    }
    // Method that maps a Transaction object to a TransactionEntity
    public static TransactionEntity mapTransactionToTransactionEntity(Transaction transaction) {
        TransactionEntity transactionEntity = new TransactionEntity();
        BeanUtils.copyProperties(transaction, transactionEntity);

        return transactionEntity;
    }
}
