package com.hex.demoservice.application.validation;

public interface ValidationService<T> {

    ValidationResult validate(T request);
}
