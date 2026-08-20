package com.example.study.exception;

import com.example.study.exception.resource_exception.TacoNotFoundException;
import com.example.study.exception.resource_exception.TacosNotFoundException;
import com.example.study.exception.response.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TacoNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleTacoNotFoundException(
            TacoNotFoundException tacoNotFoundException,
            HttpServletRequest request
    ) {
        ErrorResponse response = new ErrorResponse(
                404,
                "TACO_NOT_FOUND",
                tacoNotFoundException.getMessage(),
                request.getRequestURI()
        );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }

    @ExceptionHandler(TacosNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleTacosNotFoundException(
            TacosNotFoundException tacosNotFoundException,
            HttpServletRequest request
    ) {
        ErrorResponse response =
                new ErrorResponse(
                        404,
                        "TACOS_NOT_FOUND",
                        tacosNotFoundException.getMessage(),
                        request.getRequestURI()
                );

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}
