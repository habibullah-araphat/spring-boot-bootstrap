package com.finfolytx.spring.sms.controller;

import com.finfolytx.spring.sms.Sms;
import com.finfolytx.spring.sms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    @RequestMapping(value = "/sms", method = RequestMethod.POST)
    public Sms sendSms(@RequestBody Sms sms, HttpServletResponse response){
        boolean status = smsService.sendSms(sms);
        response.setStatus(status==true?HttpServletResponse.SC_OK:HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        return sms;
    }
}
