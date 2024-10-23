package org.example.spring.exception;

public class DataProcessingException extends RuntimeException {
    public DataProcessingException(String message) {
        super(message);
    }
}
