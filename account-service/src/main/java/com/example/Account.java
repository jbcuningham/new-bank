package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jonathancuningham on 5/4/17.
 */
@Entity
public class Account {

    @Id @GeneratedValue
    private Long accountId;

    private Long accountBalance;

    private Long clientId; // Foreign key

    public Account() {
    }

    public Account(Long accountBalance, Long clientId) {
        this.accountBalance = accountBalance;
        this.clientId = clientId;
    }

    public Long getAccountBalance() {
        return accountBalance;
    }

    public Long getClientId() {
        return clientId;
    }
}
