package com.remizov.messenger.exception;

public class NoValidNumberException extends RuntimeException {
    public NoValidNumberException(String message) {
        super(message);
    }
    public NoValidNumberException(String message,Throwable throwable) {
        super(message,throwable);
    }
}
