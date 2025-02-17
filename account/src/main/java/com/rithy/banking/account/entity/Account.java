package com.rithy.banking.account.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    private String accountType;
    private String branchAddress;
    private LocalDate createDate;
}
