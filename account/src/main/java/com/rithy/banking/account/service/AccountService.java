package com.rithy.banking.account.service;

import com.rithy.banking.account.entity.Account;

import java.util.List;

public interface AccountService {

    Account save(Account account);

    List<Account> getAccounts();

    Account getById(Long id);

}
