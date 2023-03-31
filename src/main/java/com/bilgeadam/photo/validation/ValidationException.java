package com.bilgeadam.photo.validation;


import java.util.List;

public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ValidationException(String message, List<ErrorDto> errors) {
        super(message);
    }
}
