package com.example.study.exception.resource_exception;

public class TacosNotFoundException extends RuntimeException {

    public TacosNotFoundException(String message) {
        super(message);
    }
}
