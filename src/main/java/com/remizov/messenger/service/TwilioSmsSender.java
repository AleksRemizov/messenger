package com.remizov.messenger.service;


import com.remizov.messenger.exception.NoValidNumberException;
import com.remizov.messenger.model.SmsRequest;
import com.remizov.messenger.config.TwilioConfiguration;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service("twilio")
public class TwilioSmsSender implements SmsSender {

    private static final Logger LOG = LoggerFactory.getLogger(TwilioSmsSender.class);
    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(SmsRequest smsRequest) {

        if(isPhoneNumberValid(smsRequest.getPhoneNumber())){
            PhoneNumber to = new PhoneNumber(smsRequest.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = smsRequest.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();
            LOG.info("Sent sms {}" + smsRequest);
        }else{
            throw new NoValidNumberException(
                    "Phone number [" + smsRequest.getPhoneNumber() +"] is not a valid number !");
        }
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        Pattern phonePattern = Pattern.compile("^\\+[1-9]\\d{1,14}$");
        Matcher simpleMatcher = phonePattern.matcher(phoneNumber);
        return simpleMatcher.matches();
    }
}
