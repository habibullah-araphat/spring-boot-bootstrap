package com.finfolytx.spring.role;

import com.finfolytx.spring.user.User;

import java.util.List;

public class Role {
    private int id;
    private String name;
    private List<User> users;

    public Role(int id, String name, List<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public Role() {
        id = 0;
        name = null;
        users = null;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
