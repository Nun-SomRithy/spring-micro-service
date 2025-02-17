package com.rithy.banking.card.service;

import com.rithy.banking.card.entity.Card;

import java.util.List;

public interface CardService {

    Card save(Card loan);
    List<Card> getAll();
    List<Card> getByCustomerId(Long customerId);

}
