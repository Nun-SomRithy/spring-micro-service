package com.rithy.banking.loan.mapper;

import com.rithy.banking.loan.dto.LoanDTO;
import com.rithy.banking.loan.entity.Loan;
import org.springframework.stereotype.Component;

@Component
public class LoanMapper {

    public Loan toLoan(LoanDTO dto) {
        Loan loan = new Loan();
        loan.setAmountPaid(dto.getAmountPaid());
        loan.setCreateDate(dto.getCreateDate());
        loan.setCustomerId(dto.getCustomerId());
        loan.setLoanNumber(dto.getLoanNumber());
        loan.setLoanType(dto.getLoanType());
        loan.setOutstandingAmount(dto.getOutstandingAmount());
        loan.setStartDate(dto.getStartDate());
        loan.setTotalLoan(dto.getTotalLoan());
        return loan;
    }
}