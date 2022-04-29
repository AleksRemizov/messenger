package com.remizov.messenger.model;

import com.remizov.messenger.constraint.CustomTwilioPhoneNumberConstraint;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class SmsRequest {

    @CustomTwilioPhoneNumberConstraint
    private final String phoneNumber;
    @NotBlank(message = "{message.empty}")
    @Size(max = 402, message = "message.maxSize")
    private final String message;

    protected SmsRequest( String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

