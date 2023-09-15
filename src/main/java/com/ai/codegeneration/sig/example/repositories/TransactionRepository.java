package com.ai.codegeneration.sig.example.repositories;

import com.ai.codegeneration.sig.example.entities.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {
    // find Transaction entity by card id
    Optional<List<TransactionEntity>> findByCardId(Integer cardId);
}
