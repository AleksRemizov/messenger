package com.remizov.messenger.constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomTwilioPhoneNumberValidator implements
        ConstraintValidator<CustomTwilioPhoneNumberConstraint, String> {

    @Override
    public void initialize(CustomTwilioPhoneNumberConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        return phoneNumber != null && phoneNumber.matches("^\\+?[1-9]\\d{11,14}$");
    }
}
