package com.chiru.designpatterns.singleresponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {
    private static Map<Integer, Account> accounts = new HashMap<>();

    public void addAccount(Account account){
        accounts.put(account.getAccountNumber(), account);
    }

    public void updateAccount(Account account){
        accounts.put(account.getAccountNumber(), account);
    }

    public Account geAccount(int accountNumber){
        return accounts.get(accountNumber);
    }
}
