package com.ai.codegeneration.sig.example.services;

import com.ai.codegeneration.sig.example.entities.CardEntity;
import com.ai.codegeneration.sig.example.exceptions.ResourceNotFoundException;
import com.ai.codegeneration.sig.example.generated.model.Card;
import com.ai.codegeneration.sig.example.mappers.CardMapper;
import com.ai.codegeneration.sig.example.repositories.CardRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CardService {
    private static final org.slf4j.Logger slf4jLogger = org.slf4j.LoggerFactory.getLogger(CardService.class);

     @Autowired
     private CardRepository cardRepository;

    public Card createCard(Card card) {
        CardEntity cardEntity = CardMapper.mapCardToCardEntity(card);
        CardEntity saved = saveCard(cardEntity);
        slf4jLogger.info("Card saved with id ***: " + saved.getCardId());
        return CardMapper.mapCardEntityToCard(saved);
    }

    @Transactional
    public CardEntity saveCard(CardEntity cardEntity) {
        return cardRepository.save(cardEntity);
    }

    public Card getCardById(Integer id) {
        Optional<CardEntity> cardEntity = cardRepository.findById(id);
        if (cardEntity.isEmpty()) {
            throw new ResourceNotFoundException("Card", id);
        }
        return CardMapper.mapCardEntityToCard(cardEntity.get());
    }

}
