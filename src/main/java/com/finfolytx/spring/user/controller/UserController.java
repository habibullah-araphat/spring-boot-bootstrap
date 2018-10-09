package com.finfolytx.spring.user.controller;

import com.finfolytx.spring.user.User;
import com.finfolytx.spring.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getUsers(){
        return new User(1, "John Doe", "john.doe@gmail.com", 39);
    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable int id){
        return userService.getUser(id);
    }
}
