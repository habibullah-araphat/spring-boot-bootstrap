package com.finfolytx.spring.user.service;

public class UserEmailServiceImpl implements UserEmailService {
    @Override
    public String getEmailByUserId(int id){
        return "test.email@gmail.com";
    }
}
