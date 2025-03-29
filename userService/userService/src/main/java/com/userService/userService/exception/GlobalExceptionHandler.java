package com.userService.userService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.userService.userService.payload.APIResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<APIResponse> handlingResourceNotFoundException(ResourceNotFoundException ex){
        String message = ex.getMessage();
        Object response = APIResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND);
        return new ResponseEntity<APIResponse>((APIResponse) response,HttpStatus.NOT_FOUND);
    }
}
