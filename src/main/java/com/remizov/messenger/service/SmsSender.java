package com.remizov.messenger.service;

import com.remizov.messenger.model.SmsRequest;

public interface SmsSender {
    void sendSms(SmsRequest smsRequest);
}
