package com.finfolytx.spring.user.service;

import com.finfolytx.spring.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private List<User> users = Arrays.asList(
            new User(1, "Mr. A", "", 27),
            new User(2, "Mr. B", "", 33),
            new User(3, "Mr. C", "", 37)
    );

    @Autowired
    private UserEmailService userEmailService;

    @Override
    public User getUser(int id) {
        for(User user: users){
            if(user.getId()==id){
                User curUser = new User(user.getId(), user.getName(), user.getEmail(), user.getAge());
                curUser.setEmail(userEmailService.getEmailByUserId(id));
                return curUser;
            }
        }
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return Arrays.asList(
                new User(1, "John Doe", "john.doe@gmail.com", 39)
        );
    }
}
