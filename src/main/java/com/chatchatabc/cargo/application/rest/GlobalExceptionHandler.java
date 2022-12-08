package com.chatchatabc.cargo.application.rest;

import com.chatchatabc.cargo.domain.error.CargoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

import java.net.URI;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CargoNotFoundException.class)
    public ProblemDetail handleBookmarkNotFoundException(CargoNotFoundException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        problemDetail.setTitle(e.getClass().getCanonicalName());
        if (e.getId() != null) {
            problemDetail.setDetail("Cargo not found by id: " + e.getId());
        } else {
            problemDetail.setDetail("Cargo not found by tracking id:" + e.getTrackingId());
        }
        problemDetail.setType(URI.create("https://example.com/APP-100-404"));
        return problemDetail;
    }

}