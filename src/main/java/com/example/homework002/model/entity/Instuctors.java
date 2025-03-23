package com.example.homework002.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instuctors {
    private Long id;
    private String instructor_name;
    private String email;
}
