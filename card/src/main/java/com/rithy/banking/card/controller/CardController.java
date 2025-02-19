package com.rithy.banking.card.controller;

import com.rithy.banking.card.dto.CardDTO;
import com.rithy.banking.card.entity.Card;
import com.rithy.banking.card.mapper.CardMapper;
import com.rithy.banking.card.service.CardService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cards")
@AllArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CardDTO dto){
        Card card = cardService.save(cardMapper.toCard(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(card);
    }

    @GetMapping
    public  ResponseEntity<?> list(){
        return ResponseEntity.ok(cardService.getAll());
    }

    @GetMapping("{customerId}")
    public  ResponseEntity<?> getByCustomerId(@PathVariable Long customerId){
        return ResponseEntity.ok(cardService.getByCustomerId(customerId));
    }



}
