package entity;

import inter.IAccount;

public class Account implements IAccount {
    private String name, email;
    private long accountNumber, accountBalance;

    public Account(String name, String email, long accountNumber, long accountBalance) {
        this.name = name;
        this.email = email;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }


    @Override
    public void recharge(double amount) {
        accountBalance +=amount;
    }

    @Override
    public void changeEmail(String email) {
        this.email = email;
    }

    @Override
    public void displayInfo() {
        System.out.println("Account{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                '}');
    }
}
