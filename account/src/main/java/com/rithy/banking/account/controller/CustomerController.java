package com.rithy.banking.account.controller;

import com.rithy.banking.account.dto.CustomerDTO;
import com.rithy.banking.account.entity.Customer;
import com.rithy.banking.account.mapper.CustomerMapper;
import com.rithy.banking.account.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO customerDTO) {
        Customer customer = customerMapper.toCustomer(customerDTO);
        customer = customerService.save(customer);
        return ResponseEntity.ok(customer);
    }

    @GetMapping
    public ResponseEntity<?> getCustomer() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<?> getCustomers(@PathVariable Long id){
        return  ResponseEntity.ok(customerService.getById(id));
    }


}
