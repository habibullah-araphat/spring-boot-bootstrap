package com.finfolytx.spring.role;

import com.finfolytx.spring.user.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RoleController {
    @RequestMapping("role")
    public List<Role> getRoles(){
        List<Role> roles = Arrays.asList(
                new Role(
                        1,
                        "Admin",
                        Arrays.asList(
                                new User(1, "Mr. A", "A@gmail.com", 20),
                                new User(2, "Mr. B", "B@gmail.com", 30)
                        )
                ),
                new Role(
                        2,
                        "User",
                        Arrays.asList(
                                new User(3, "Mr. C", "C@gmail.com", 26),
                                new User(4, "Mr. D", "D@gmail.com", 35)
                        )
                )

        );

        return roles;
    }
}
