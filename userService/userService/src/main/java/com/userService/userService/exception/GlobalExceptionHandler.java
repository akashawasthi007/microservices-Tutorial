package com.userService.userService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.userService.userService.exception.ResourceNotFoundException;
import com.userService.userService.payload.APIResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIResponse> handlingResourceNotFoundException(ResourceNotFoundException ex){
        String message = ex.getMessage();
        APIResponse response = APIResponse.builder()
                .message(message)
                .success(false)   // since it's a NOT_FOUND case
                .status(HttpStatus.NOT_FOUND)
                .build();
        

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
