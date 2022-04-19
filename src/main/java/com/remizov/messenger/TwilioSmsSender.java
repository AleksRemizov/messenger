package com.remizov.messenger;

import com.twilio.sdk.creator.api.v2010.account.MessageCreator;
import com.twilio.sdk.resource.api.v2010.account.Message;
import com.twilio.sdk.type.PhoneNumber;
import org.springframework.stereotype.Service;

@Service
public class TwilioSmsSender implements SmsSender{
    private final TwilioConfiguration twilioConfiguration;

    public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(SmsRequest smsRequest) {
        MessageCreator creator = Message.create(
                twilioConfiguration.getAccountSid(),
                new PhoneNumber(smsRequest.getPhoneNumber()),
                new PhoneNumber(""),
                smsRequest.getMessage()
        );
    }
}
