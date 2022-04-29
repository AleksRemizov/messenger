package com.remizov.messenger.controller;

import com.remizov.messenger.service.Service;
import com.remizov.messenger.model.SmsRequest;
import com.remizov.messenger.validator.SmsValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@org.springframework.stereotype.Controller
@RequestMapping("api/v1/messenger")
public class Controller {
    private final Service service;

    private final SmsValidator smsValidator;

    @Autowired
    public Controller(Service service, SmsValidator smsValidator) {
        this.service = service;
        this.smsValidator = smsValidator;
    }

    @GetMapping
    public String homePage(SmsRequest smsRequest) {
        return "sms";
    }

    @PostMapping
    public String addRepair(@Valid SmsRequest smsRequest, BindingResult result, Model model) {
        smsValidator.validate(smsRequest, result);
        if (result.hasErrors()) {
            return "sms";
        }else {
            this.service.sendSms(smsRequest);
        }
        return "response";
    }
}
