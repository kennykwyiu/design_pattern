package org.kenny.design.pattern.structural.bridge;

public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("Open saving account");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("This is a saving account");
    }
}
