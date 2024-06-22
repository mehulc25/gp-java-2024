package com.globalpayex.banking.exceptions;

public class LowBalException extends Exception {

    public LowBalException(String message) {
        super(message);
    }
}
