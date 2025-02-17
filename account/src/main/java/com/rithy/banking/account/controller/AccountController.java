package com.rithy.banking.account.controller;


import com.rithy.banking.account.dto.AccountDTO;
import com.rithy.banking.account.entity.Account;
import com.rithy.banking.account.mapper.AccountMapper;
import com.rithy.banking.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/accounts")
@RequiredArgsConstructor
public class AccountController {

    private  final AccountService accountService;
    private  final AccountMapper accountMapper;

    @PostMapping
    public ResponseEntity<?> saveAccount(@RequestBody AccountDTO accountDTO) {
        Account account = accountMapper.toAccount(accountDTO);
        account = accountService.save(account);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    public  ResponseEntity<?> getAccounts(){
        return  ResponseEntity.ok(accountService.getAccounts());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(accountService.getById(id));
    }




}
