package com.hex.demoservice.application.validation;

import com.hex.demoservice.interfaces.ErrorCode;

public class ValidationResult {

    private Boolean isValid;
    private String message;
    private ErrorCode errorCode;

    public ValidationResult(Boolean isValid) {
        this.isValid = isValid;
    }

    public ValidationResult(Boolean isValid, String message, ErrorCode errorCode) {
        this(isValid);
        this.message = message;
        this.errorCode = errorCode;
    }

    public static ValidationResult error(String message, ErrorCode errorCode) {
        return new ValidationResult(Boolean.FALSE, message, errorCode);
    }

    public static ValidationResult success() {
        return new ValidationResult(Boolean.TRUE);
    }

    public Boolean getIsValid() {
        return isValid;
    }
}
