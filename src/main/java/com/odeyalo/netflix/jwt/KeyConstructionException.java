package com.odeyalo.netflix.jwt;

public class KeyConstructionException extends Exception {

    public KeyConstructionException(String message) {
        super(message);
    }

    public KeyConstructionException(String message, Throwable cause) {
        super(message, cause);
    }
}
