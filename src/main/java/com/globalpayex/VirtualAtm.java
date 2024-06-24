package com.globalpayex;

import com.globalpayex.banking.entities.AccType;
import com.globalpayex.banking.entities.Account;
import com.globalpayex.banking.exceptions.LowBalException;

public class VirtualAtm {

    public static void main(String[] args) {
        Account account = new Account(1234, AccType.Savings, 50000);

        // husband withdraw atm - Thread
        new Thread(() -> {
            try {
                account.withdraw(5000);
            } catch (LowBalException e) {
                throw new RuntimeException(e);
            }
        }, "Husband").start();

        // wife withdraw atm - Thread
        new Thread(() -> {
            try {
                account.withdraw(15000);
            } catch (LowBalException e) {
                throw new RuntimeException(e);
            }
        }, "Wife").start();
    }
}
