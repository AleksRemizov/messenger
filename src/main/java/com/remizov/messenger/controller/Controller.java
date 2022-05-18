package com.remizov.messenger.controller;

import com.remizov.messenger.model.SmsRequest;
import com.remizov.messenger.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
@RequestMapping("api/v1/messenger")
public class Controller {
    private final Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping
    public String homePage(SmsRequest smsRequest) {
        return "sms";
    }

    @PostMapping
    public String sendSms(@Valid SmsRequest smsRequest, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "sms";
        }else {
            this.service.sendSms(smsRequest);
        }
        return "response";
    }
}
