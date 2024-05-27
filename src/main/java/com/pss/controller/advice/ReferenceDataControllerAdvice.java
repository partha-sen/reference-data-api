package com.pss.controller.advice;

import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
@Slf4j
public class ReferenceDataControllerAdvice {
    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseEntity<Object> handleCustomViolationException(ConstraintViolationException e, WebRequest req){
        log.info("Custom validation Failed", e);
        List<ResponseEntity<String>> errors = e.getConstraintViolations().stream()
                .map(v -> ResponseEntity.badRequest().body(v.getMessage()))
                .collect(Collectors.toList());
        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<Object> handleGeneralException(Exception e, WebRequest req){
        log.info("General exception", e);
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
