package com.finfolytx.spring.course;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
    int id;
    @JsonProperty("courseName")
    String name;

    public Course() {
        this.id = -1;
        this.name = null;
    }

    public Course(int id, String name) {

        this.id = id;
        this.name = name;
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
}
