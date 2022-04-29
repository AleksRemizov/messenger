package com.remizov.messenger.validator;

import com.remizov.messenger.model.SmsRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class SmsValidator implements Validator {
    private final Integer MESSAGE_SIZE = 402;

    @Override
    public boolean supports(Class<?> clazz) {
        return SmsRequest.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SmsRequest smsRequest = (SmsRequest) target;

        ValidationUtils.rejectIfEmpty(errors, "phoneNumber","400","phoneNumber.empty");

        ValidationUtils.rejectIfEmpty(errors,"message","400","message.empty");
        if (StringUtils.hasLength(smsRequest.getMessage())
                && smsRequest.getMessage().length() > MESSAGE_SIZE) {
            errors.rejectValue("message", "message.maxSize");
        }

    }
}
