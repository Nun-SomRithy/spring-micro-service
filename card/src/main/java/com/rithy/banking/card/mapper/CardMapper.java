package com.rithy.banking.card.mapper;

import com.rithy.banking.card.dto.CardDTO;
import com.rithy.banking.card.entity.Card;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

//@Mapper(componentModel = "spring")
@Component
public class CardMapper {

  public  Card toCard(CardDTO dto){
    Card card = new Card();
    card.setCardId(dto.getCardId());
    card.setCustomerId(dto.getCustomerId());
    card.setCardNumber(dto.getCardNumber());
    card.setCardType(dto.getCardType());
    card.setTotalLimit(dto.getTotalLimit());
    card.setAmountUsed(dto.getAmountUsed());
    card.setAvailableAmount(dto.getAvailableAmount());
    card.setCreateDate(dto.getCreateDate());
    return card;
  };


}