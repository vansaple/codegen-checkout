package com.ai.codegeneration.sig.example.entities;

// Entity class for Transaction

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "transaction")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEntity {
    // Transaction ID
    @Id
    @GeneratedValue
    private Integer transactionId;
    // Transaction amount
    private BigDecimal amount;
    //currency
    private String currency;
    // Transaction date
    private String transactionDate;
    // Card ID
    private Integer cardId;

}
