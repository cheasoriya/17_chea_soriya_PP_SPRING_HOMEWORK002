package com.example.homework002.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

    private String student_name;
    private String email;
    private String student_phone;

}
