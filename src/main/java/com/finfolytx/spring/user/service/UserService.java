package com.finfolytx.spring.user.service;

import com.finfolytx.spring.user.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    List<User> getAllUser();
}
