package com.rithy.banking.account.config;

import com.rithy.banking.account.entity.Account;
import com.rithy.banking.account.entity.Customer;
import com.rithy.banking.account.repository.AccountRepository;
import com.rithy.banking.account.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
@Slf4j
@AllArgsConstructor
public class SetupAccountRunner implements CommandLineRunner {

    private  CustomerRepository customerRepository;
    private AccountRepository accountRepository;
    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer();
        customer.setCreateDate(LocalDate.now());
        customer.setEmail("rithybek@gmail.com");
        customer.setMobileNumber("070363363");
        customer.setName("Som Rithy");
        customerRepository.save(customer);

        Account account = new Account();
        account.setAccountNumber(1L);
        account.setAccountType("Saving");
        account.setBranchAddress("Phnom Penh");
        account.setCreateDate(LocalDate.now());
        account.setCustomer(customer);
        accountRepository.save(account);
        log.info("Account created");
    }
}
