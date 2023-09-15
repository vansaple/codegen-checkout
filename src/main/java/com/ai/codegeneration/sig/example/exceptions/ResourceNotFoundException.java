package com.ai.codegeneration.sig.example.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    // Constructor
    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s: %s", resourceName, fieldName, fieldValue));
    }

    public ResourceNotFoundException(String resourceName, Object fieldValue) {
        this(resourceName, "id", fieldValue);
    }

}
