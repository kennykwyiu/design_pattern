package org.kenny.design.pattern.structural.bridge;

public class ABCBank extends Bank{
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Open China Agricultural Bank account");
        return account;
    }
}
