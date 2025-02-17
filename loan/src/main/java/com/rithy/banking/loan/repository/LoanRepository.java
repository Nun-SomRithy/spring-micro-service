package com.rithy.banking.loan.repository;

import com.rithy.banking.loan.entity.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LoanRepository extends MongoRepository<Loan, Long> {
    List<Loan> findByCustomerId(Long customerId);

}
