package com.globalpayex.banking.entities;

import com.globalpayex.banking.exceptions.LowBalException;

import java.util.Optional;

public class Account {

    private int accNo;
    private AccType accType; // using an enum as a data type
    private double balance;

    public static final String ACCTYPE_SAVINGS = "Savings";
    public static final String ACCTYPE_CURRENT = "Current";

    public Account() {}

    public Account(int accNo, AccType accType, double balance) {
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
        /* if (accType.equals(Account.ACCTYPE_SAVINGS) || accType.equals(Account.ACCTYPE_CURRENT)) {
            this.accType = accType;
        } */
        this.accType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }

    public double deposit(double amt) {
        this.balance += amt;
        return this.balance;
    }

    public double withdraw(double amt) throws LowBalException {
        System.out.println("transaction starts");

        try {
            // amt passed to the method is 0 or negative
            if (amt <= 0) {
                // throwing an exception object to the caller of this method
                // Exception
                throw new IllegalArgumentException("amt passed needs to be positive and non zero");
            }

            if (this.balance - amt < 1000) {
                // throw new IllegalStateException("account getting into low balance");
                throw new LowBalException("account getting into low balance");
            }

            this.balance -= amt; // the account goes in low balance state
            return this.balance;
        } finally {
            System.out.println("transaction ends");
        }
    }

    public Optional<String> getDetails() {
        if (this.accNo == 0) {
           return Optional.empty();
        }

        return Optional.of(String.format(
                "Acc no: %s\nAcc Type: %s\nBalance: %s",
                this.accNo,
                this.accType,
                this.balance
        ));
    }
}
