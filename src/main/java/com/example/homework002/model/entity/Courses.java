package com.example.homework002.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Courses {
    private Long id;
    private String course_name;
    private String description;
    private Instuctors instructor;
}
