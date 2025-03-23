package com.example.homework002.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstructorRequest {
    private String instructor_name;
    private String email;
}
