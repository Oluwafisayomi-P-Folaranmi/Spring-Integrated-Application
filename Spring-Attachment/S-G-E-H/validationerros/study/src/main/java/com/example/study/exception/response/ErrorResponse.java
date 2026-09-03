package com.example.study.exception.response;

public record ErrorResponse(
        int status,
        String error,
        String message,
        String path
) {
}
