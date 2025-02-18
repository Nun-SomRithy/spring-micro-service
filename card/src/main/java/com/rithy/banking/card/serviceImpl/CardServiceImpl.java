package com.rithy.banking.card.serviceImpl;

import com.rithy.banking.card.entity.Card;
import com.rithy.banking.card.repository.CardRepository;
import com.rithy.banking.card.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public List<Card> getAll() {
        return cardRepository.findAll();
    }

    @Override
    public List<Card> getByCustomerId(Long customerId) {
        return cardRepository.findByCustomerId(customerId);
    }

}
