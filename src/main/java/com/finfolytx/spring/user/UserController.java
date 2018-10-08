package com.finfolytx.spring.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user")
    public User getUser(){
        return new User(1, "John Doe", "john.doe@gmail.com", 39);
    }
}
