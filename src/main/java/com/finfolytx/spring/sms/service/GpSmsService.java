package com.finfolytx.spring.sms.service;

import com.finfolytx.spring.sms.Sms;
import org.springframework.stereotype.Service;

@Service
public class GpSmsService implements SmsService {
    @Override
    public boolean sendSms(Sms sms) {
        System.out.println("--------------Sms Sent by GP---------------\n\n");
        System.out.println(sms.getMessage());
        System.out.println("\n\n-------------------------------------------");
        return true;
    }
}
