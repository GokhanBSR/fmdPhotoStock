package com.bilgeadam.photo.validation;


import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

public class ValidationUtils {

    public static void validate(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ErrorDto> errors = new ArrayList<>();
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                ErrorDto error = new ErrorDto(fieldError.getField(), fieldError.getDefaultMessage());
                errors.add(error);
            }
            throw new ValidationException("Validation error occurred", errors);
        }
    }
}