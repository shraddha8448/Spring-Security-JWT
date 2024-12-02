package com.spring_security.Spring_Security_Demo.controller;

import com.spring_security.Spring_Security_Demo.modal.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentList = new ArrayList<>(List.of(
            new Student(1,"Ram","Java"),
            new Student(12,"sham","Block chain")
            ));

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/students")
    public List<Student> getStudentList(){
        return studentList;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        studentList.add(student);
        return student;
    }
}
