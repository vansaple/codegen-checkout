package com.ai.codegeneration.sig.example.api;

import com.ai.codegeneration.sig.example.exceptions.ResourceNotFoundException;
import com.ai.codegeneration.sig.example.generated.model.Error;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class CheckoutExceptionHandler {
    private static final Logger slf4jLogger = LoggerFactory.getLogger(CheckoutExceptionHandler.class);

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Error> handleResourceNotFoundException(ResourceNotFoundException e) {
        Error error = new Error();
        error.setMessage(e.getMessage());
        error.setCode(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleAllOtherExceptions(Exception e) {
        slf4jLogger.error("Internal Server Error", e);
        Error error = new Error();
        error.setMessage(e.getMessage());
        error.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
