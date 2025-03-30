package com.chiru.designpatterns.singleresponsibility;

import java.math.BigDecimal;

public class TransactionsOperations {
    public void deposit(BigDecimal amount, int accountNumber){
        AccountOperations acntOperations = new AccountOperations();
        Account account = acntOperations.geAccount(accountNumber);
        account.setBalance(account.getBalance().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber){
        AccountOperations acntOperations = new AccountOperations();
        Account account = acntOperations.geAccount(accountNumber);
        account.setBalance(account.getBalance().subtract(amount));
    }
}
