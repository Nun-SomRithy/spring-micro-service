package com.rithy.banking.account.mapper;


import com.rithy.banking.account.dto.CustomerDTO;
import com.rithy.banking.account.entity.Customer;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class CustomerMapper {
    public Customer toCustomer(CustomerDTO customerDTO ){
        Customer  customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setMobileNumber(customerDTO.getMobileNumber());
        customer.setCreateDate(LocalDate.parse(customerDTO.getCreateDate()));
        return  customer;
    }

}
