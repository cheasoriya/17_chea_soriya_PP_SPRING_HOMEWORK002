package com.example.homework002.controller;

import com.example.homework002.model.entity.Student;
import com.example.homework002.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/student")
public class StduentConstroller {

    private final StudentService stduentConstroller;


    public StduentConstroller(StudentService stduentConstroller) {
        this.stduentConstroller = stduentConstroller;
    }

    @GetMapping
    public List<Student> getStudents() {
        return stduentConstroller.getAllStudent();
    }


}
