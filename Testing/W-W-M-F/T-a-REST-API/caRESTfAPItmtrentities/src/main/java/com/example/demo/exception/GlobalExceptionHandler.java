package com.example.demo.exception;

import com.example.demo.data.model.Country;
import com.example.demo.data.model.Passenger;
import com.example.demo.exception.business.PassengerNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Passenger>
    handlePassengerNotFoundException(PassengerNotFoundException passengerNotFoundException,
                                     HttpRequestHandlerServlet httpRequestHandlerServlet
                                     ) {
        // Extract the error
        var error = passengerNotFoundException.getMessage();
        var request = httpRequestHandlerServlet.getServletInfo();
        return null;
    }
}
