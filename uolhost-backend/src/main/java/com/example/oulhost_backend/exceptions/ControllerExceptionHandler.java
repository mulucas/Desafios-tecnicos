package com.example.oulhost_backend.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity threatNoSuchElementException (NoSuchElementException exception){
        ExceptionDto dto = new ExceptionDto("Essa lista não possui mais Jogadores disponíveis", "400");
        return ResponseEntity.badRequest().body(dto);
    }
}
