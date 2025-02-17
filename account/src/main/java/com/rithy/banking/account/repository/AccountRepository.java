package com.rithy.banking.account.repository;

import com.rithy.banking.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account,Long> {

}
