package com.rithy.banking.account.mapper;

import com.rithy.banking.account.dto.AccountDTO;
import com.rithy.banking.account.entity.Account;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class AccountMapper {

    public Account toAccount(AccountDTO accountDTO){
        Account account =  new Account();
        account.setAccountNumber(accountDTO.getAccountNumber());
//        account.setCustomerId(accountDTO.getCustomerId());
        account.setAccountType(accountDTO.getAccountType());
        account.setBranchAddress(accountDTO.getBranchAddress());
        account.setCreateDate((accountDTO.getCreateDate()));
        return  account;
    }
}
