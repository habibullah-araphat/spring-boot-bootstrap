package com.finfolytx.spring.sms.service;

import com.finfolytx.spring.sms.Sms;

public interface SmsService {
    boolean sendSms(Sms sms);
}

