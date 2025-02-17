package com.rithy.banking.card.serviceImpl;

import com.rithy.banking.card.entity.Card;
import com.rithy.banking.card.repository.CardRepository;
import com.rithy.banking.card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private  final CardRepository cardRepository;

    @Override
    public Card save(Card loan) {
        return null;
    }

    @Override
    public List<Card> getAll() {
        return null;
    }

    @Override
    public List<Card> getByCustomerId(Long customerId) {
        return null;
    }
}
