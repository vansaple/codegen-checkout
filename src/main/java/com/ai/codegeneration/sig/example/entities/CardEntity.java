package com.ai.codegeneration.sig.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "card")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardEntity {
    // Card ID
    @Id
    @GeneratedValue
    private Integer cardId;
    // First name
    private String firstName;
    // Last name
    private String lastName;
    // Card number
    private String cardNumber;
    // expiration month
    private String expirationMonth;
    // expiration year
    private String expirationYear;

}
