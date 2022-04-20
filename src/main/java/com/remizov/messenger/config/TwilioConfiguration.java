package com.remizov.messenger.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("twilio")
public class TwilioConfiguration {
    private String accountSid;
    private String authToken;
    private String trialNumber;

    public TwilioConfiguration(){
    }

    public String getAccountSid() {
        return accountSid;
    }

    public TwilioConfiguration setAccountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }

    public String getAuthToken() {
        return authToken;
    }

    public TwilioConfiguration setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }

    public String getTrialNumber() {
        return trialNumber;
    }

    public TwilioConfiguration setTrialNumber(String trialNumber) {
        this.trialNumber = trialNumber;
        return this;
    }
}
