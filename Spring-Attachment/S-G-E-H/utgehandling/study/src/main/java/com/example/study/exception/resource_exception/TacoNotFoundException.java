package com.example.study.exception.resource_exception;

public class TacoNotFoundException extends RuntimeException {

    public TacoNotFoundException(String message) {
        super(message);
    }
}
