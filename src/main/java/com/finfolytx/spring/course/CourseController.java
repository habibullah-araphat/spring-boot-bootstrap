package com.finfolytx.spring.course;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping(value = "/course", method = RequestMethod.GET)
    public Course getCour(HttpServletResponse response){
        Course course = new Course(11, "CSE 101");
        response.setStatus(HttpServletResponse.SC_PARTIAL_CONTENT);
        return course;
    }
}
