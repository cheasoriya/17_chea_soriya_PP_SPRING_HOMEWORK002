package com.example.homework002.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class student_Course {
    private Long id;
    private Long student_id;
    private Long course_id;
}
