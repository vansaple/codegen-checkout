package com.ai.codegeneration.sig.example.mappers;

import com.ai.codegeneration.sig.example.entities.CardEntity;
import com.ai.codegeneration.sig.example.generated.model.Card;
import org.springframework.beans.BeanUtils;

public class CardMapper {
    // Method that maps a CardEntity to a Card object
    public static Card mapCardEntityToCard(CardEntity cardEntity) {
        Card card = new Card();
        BeanUtils.copyProperties(cardEntity, card);

        return card;
    }

    // Method that maps a Card object to a CardEntity
    public static CardEntity mapCardToCardEntity(Card card) {
        CardEntity cardEntity = new CardEntity();
        BeanUtils.copyProperties(card, cardEntity);

        return cardEntity;
    }

}
