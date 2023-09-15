package com.ai.codegeneration.sig.example.services;

import com.ai.codegeneration.sig.example.entities.TransactionEntity;
import com.ai.codegeneration.sig.example.exceptions.ResourceNotFoundException;
import com.ai.codegeneration.sig.example.mappers.TransactionMapper;
import com.ai.codegeneration.sig.example.repositories.TransactionRepository;
import com.ai.codegeneration.sig.example.generated.model.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
     @Autowired
     private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
         TransactionEntity transactionEntity = TransactionMapper.mapTransactionToTransactionEntity(transaction);
        TransactionEntity savedTransactionEntity = saveTransaction(transactionEntity);
         return TransactionMapper.mapTransactionEntityToTransaction(savedTransactionEntity);
    }

    @Transactional
    public TransactionEntity saveTransaction(TransactionEntity transactionEntity) {
        return transactionRepository.save(transactionEntity);
    }
    public Transaction getTransactionById(Integer id) {
        Optional<TransactionEntity> transactionEntity = transactionRepository.findById(id);
        if (transactionEntity.isEmpty()) {
            throw new ResourceNotFoundException("Transaction", id);
        }
        return TransactionMapper.mapTransactionEntityToTransaction(transactionEntity.get());


    }
    //Add method to get all transactions for a cardId
    public List<Transaction> getTransactionsByCardId(Integer cardId) {
        Optional<List<TransactionEntity>> transactionEntities = transactionRepository.findByCardId(cardId);
        if (transactionEntities.isEmpty() || transactionEntities.get().isEmpty()) {
            throw new ResourceNotFoundException("Transaction", "cardId", cardId);
        }
        List<Transaction> transactions = new ArrayList<>();
        for (TransactionEntity transactionEntity : transactionEntities.get()) {
            transactions.add(TransactionMapper.mapTransactionEntityToTransaction(transactionEntity));
        }
        return transactions;
    }

}
