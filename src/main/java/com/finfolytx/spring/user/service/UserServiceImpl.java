package com.finfolytx.spring.user.service;

import com.finfolytx.spring.user.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private List<User> users = Arrays.asList(
            new User(1, "Mr. A", "A@gmail.com", 27),
            new User(2, "Mr. B", "B@gmail.com", 33),
            new User(3, "Mr. C", "C@gmail.com", 37)
    );

    @Override
    public User getUser(int id) {
        for(User user: users){
            if(user.getId()==id)return user;
        }
        return null;
    }
}
