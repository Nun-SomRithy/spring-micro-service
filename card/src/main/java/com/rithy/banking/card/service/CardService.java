package com.rithy.banking.card.service;

import com.rithy.banking.card.entity.Card;

import java.util.List;

public interface CardService {

    Card save(Card card);
    List<Card> getAll();
    List<Card> getByCustomerId(Long customerId);

}
