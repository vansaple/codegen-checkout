package com.ai.codegeneration.sig.example.api;

import com.ai.codegeneration.sig.example.services.CardService;
import com.ai.codegeneration.sig.example.generated.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.ai.codegeneration.sig.example.generated.api.CardsApiDelegate;

@Component
public class CardsApiDelegateImpl implements CardsApiDelegate{
     @Autowired
     private CardService cardService;

     public ResponseEntity<Card> saveCard(Card card) {
         Card cardDto = cardService.createCard(card);
         return new ResponseEntity<>(cardDto, HttpStatus.OK);
     }

     public ResponseEntity<Card> getCardById(Integer id) {
         Card cardDto = cardService.getCardById(id);
         return new ResponseEntity<>(cardDto, HttpStatus.OK);
     }
}
