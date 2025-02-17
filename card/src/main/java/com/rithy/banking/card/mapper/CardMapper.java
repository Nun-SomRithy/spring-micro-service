package com.rithy.banking.card.mapper;

import com.rithy.banking.card.dto.CardDTO;
import com.rithy.banking.card.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {

  Card toCard(CardDTO dto);

}