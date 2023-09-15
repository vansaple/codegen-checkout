package com.ai.codegeneration.sig.example.repositories;

import com.ai.codegeneration.sig.example.entities.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<CardEntity, Integer> {
}
