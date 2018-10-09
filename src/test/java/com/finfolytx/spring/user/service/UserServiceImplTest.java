package com.finfolytx.spring.user.service;

import com.finfolytx.spring.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class UserServiceImplTest {
    /*
     * Test configuration for UserService
     */
    @TestConfiguration
    static class UserServiceImplTestContextConfiguration {

        @Bean
        public UserService userService() {
            return new UserServiceImpl();
        }
    }

    /*
     * Bean creation UserService
     */
    @Autowired
    private UserService userService;

    /*
     * Creating MockBean for UserService Dependencies
     */
    @MockBean
    private UserEmailService userEmailService;

    @Test
    public void whenValidId_thenUserShouldBeFound() {
        String userEmail = "test.email@gmail.com";
        int userId = 1;
        User user = new User(1, "Mr. A", "", 27);

        Mockito.when(userEmailService.getEmailByUserId(userId))
                .thenReturn(userEmail);



        User foundUser = userService.getUser(userId);

        assertEquals(foundUser.getId(), user.getId());
        assertEquals(foundUser.getName(), user.getName());
        assertEquals(foundUser.getEmail(), userEmail);
        assertEquals(foundUser.getAge(), user.getAge());
    }

}