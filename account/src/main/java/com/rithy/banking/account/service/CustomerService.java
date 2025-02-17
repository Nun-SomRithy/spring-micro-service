package com.rithy.banking.account.service;

import com.rithy.banking.account.entity.Customer;
import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer> getCustomers();
    Customer getById(Long id);

}
