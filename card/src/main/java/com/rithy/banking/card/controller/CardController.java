package com.rithy.banking.card.controller;

import com.rithy.banking.card.dto.CardDTO;
import com.rithy.banking.card.entity.Card;
import com.rithy.banking.card.mapper.CardMapper;
import com.rithy.banking.card.service.CardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/card")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private  final CardMapper cardMapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CardDTO dto){
        Card loan = cardService.save(cardMapper.toCard(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(loan);
    }



}
