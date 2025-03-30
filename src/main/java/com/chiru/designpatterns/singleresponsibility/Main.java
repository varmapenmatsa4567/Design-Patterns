package com.chiru.designpatterns.singleresponsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(1234);
        account.setFirstName("Chiranjeevi");
        account.setBalance(BigDecimal.valueOf(1000));
        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);

        TransactionsOperations transactionsOperations = new TransactionsOperations();
        transactionsOperations.deposit(BigDecimal.valueOf(200), 1234);

        System.out.println(account.getBalance());
    }
}
