package org.kenny.design.pattern.structural.bridge;

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("Open ICBC account");
        return account;
    }
}
