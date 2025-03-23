package com.example.homework002.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private String student_name;
    private String email;
    private String student_phone;
    private List<student_Course> student_courses;
}
