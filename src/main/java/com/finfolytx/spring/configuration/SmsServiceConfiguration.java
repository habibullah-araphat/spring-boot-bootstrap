package com.finfolytx.spring.configuration;

import com.finfolytx.spring.sms.service.GpSmsService;
import com.finfolytx.spring.sms.service.SmsService;
import com.finfolytx.spring.sms.service.TeletalkSmsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@Qualifier("SmsService")
public class SmsServiceConfiguration {

    @Bean
    @Primary
    @ConditionalOnProperty(name = "operator.name", havingValue = "gp", matchIfMissing = true)
    public SmsService gpSmsService() {
        return new GpSmsService();
    }

    @Bean
    @Primary
    @ConditionalOnProperty(name = "operator.name", havingValue = "teletalk")
    public SmsService teletalkSmsService() {
        return new TeletalkSmsService();
    }
}
