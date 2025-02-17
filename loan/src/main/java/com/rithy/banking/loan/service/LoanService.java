package com.rithy.banking.loan.service;

import com.rithy.banking.loan.entity.Loan;

import java.util.List;

public interface LoanService {

    Loan save(Loan loan);
    List<Loan> getAll();
    List<Loan> getByCustomerId(Long customerId);

}
