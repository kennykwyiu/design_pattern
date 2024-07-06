package org.kenny.design.pattern.structural.bridge;

public class DepositAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("Open fixed time deposit account");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("This is a fixed time deposit account");
    }
}
