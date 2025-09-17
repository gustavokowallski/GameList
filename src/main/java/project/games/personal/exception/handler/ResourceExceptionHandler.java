package project.games.personal.exception.handler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import project.games.personal.exception.ConflictException;
import project.games.personal.exception.ResourceNotFoundException;
import project.games.personal.exception.dto.StandardError;
import project.games.personal.exception.dto.ValidationError;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<StandardError> handleConflict(ConflictException e, HttpServletRequest request) {
        return buildStandardResponse(HttpStatus.CONFLICT, e, request);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> handleNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        return buildStandardResponse(HttpStatus.NOT_FOUND, e, request);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationError> handleValidationError(MethodArgumentNotValidException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
        return buildValidationResponse(status, e, request);
    }

    private ResponseEntity<StandardError> buildStandardResponse(HttpStatus status, Exception e, HttpServletRequest request) {
        StandardError error = new StandardError(
                Instant.now(),
                status.value(),
                "Error",
                e.getMessage(),
                request.getRequestURI()
        );
        return ResponseEntity.status(status).body(error);
    }

    private ResponseEntity<ValidationError> buildValidationResponse(HttpStatus status, MethodArgumentNotValidException e, HttpServletRequest request) {
        ValidationError err = new ValidationError(
                Instant.now(),
                status.value(),
                "Validation Error",
                "Invalid data",
                request.getRequestURI()
        );
        for (FieldError f : e.getBindingResult().getFieldErrors()) {
            err.addError(f.getField(), f.getDefaultMessage());
        }

        return ResponseEntity.status(status).body(err);
    }


}



