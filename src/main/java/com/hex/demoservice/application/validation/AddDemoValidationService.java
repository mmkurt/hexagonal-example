package com.hex.demoservice.application.validation;

import com.hex.demoservice.interfaces.ErrorCode;
import com.hex.demoservice.interfaces.request.DemoRequest;

public class AddDemoValidationService implements ValidationService<DemoRequest> {

    @Override
    public ValidationResult validate(DemoRequest request) {

        if(request.getName() == null || request.getName().isEmpty())
            return ValidationResult.error("Name cannot be empty", ErrorCode.NAMEISINVALID);

        if(request.getSurname() == null || request.getSurname().isEmpty())
            return ValidationResult.error("Surname cannot be empty", ErrorCode.SURNAMEISINVALID);

        if(request.getEmail() == null || request.getEmail().isEmpty())
            return ValidationResult.error("Email cannot be empty", ErrorCode.EMAILISINVALID);

        if(request.getPhone() == null || request.getPhone().isEmpty())
            return ValidationResult.error("Surname cannot be empty", ErrorCode.PHONEISINVALID);

        if(request.getCity() == null || request.getCity().isEmpty())
            return ValidationResult.error("Surname cannot be empty", ErrorCode.CITYISINVALID);

        return ValidationResult.success();
    }
}
