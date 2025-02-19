package com.rithy.banking.loan.controller;

import com.rithy.banking.loan.dto.LoanDTO;
import com.rithy.banking.loan.entity.Loan;
import com.rithy.banking.loan.mapper.LoanMapper;
import com.rithy.banking.loan.service.LoanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("api/loan")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;
    private  final LoanMapper loanMapper;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody LoanDTO loanDTO){
        Loan loan =  loanService.save(loanMapper.toLoan(loanDTO));
        return  ResponseEntity.status(HttpStatus.CREATED).body(loan);
    }

    @GetMapping
    public  ResponseEntity<?> getAll(){
        return  ResponseEntity.ok(loanService.getAll()) ;
    }

    @GetMapping("{customerId}")
    public ResponseEntity<?> getByCustomerId(@PathVariable Long customerId){
        return   ResponseEntity.ok(loanService.getByCustomerId(customerId));
    }

}
