package com.globalpayex.banking.entities;

import com.globalpayex.banking.exceptions.LowBalException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testNegativeAmtWithdrawl() {
        var account = new Account(1234, AccType.Savings, 10000);
        assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(-9000)
        );
    }

    @Test
    void testLowBalWithdrawl() {
        var account = new Account(1234, AccType.Savings, 10000);
        assertThrows(
                LowBalException.class,
                () -> account.withdraw(9500)
        );
    }

    @Test
    void testDepositWithdrawl() {
        var account = new Account(1234, AccType.Savings, 10000);

        double bal = account.deposit(5000);
        assertEquals(15000, bal);


        try {
            bal = account.withdraw(4000);
        } catch (LowBalException e) {
            System.out.println(e.getMessage());
        }


        assertEquals(11000, bal);

        account
                .getDetails()
                .ifPresent(details -> System.out.println(details.toUpperCase()));
    }

    @Test
    void testEmptyAccount() {
        var account = new Account();
        assertEquals(0.0, account.getBalance());

        account
                .getDetails()
                .ifPresentOrElse(
                        details -> System.out.println(details.toUpperCase()),
                        () -> System.out.println("account not initialized")
                );

        /* String details = account.getDetails();

        // Null pointer check
        if (details != null) {
            System.out.println(details.toUpperCase());
        } else {
            System.out.println("account not initialized");
        } */
    }
}