package com.userService.userService.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(){
        super("Respurce Not Found !!!");
    }
    
    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
