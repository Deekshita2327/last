package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public Student getStudent() {
        return new Student(1, "Deekshitha");
    }

    @GetMapping("/name")
    public String getName() {
        return "Deekshitha";
    }
}
