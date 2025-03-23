package com.example.homework002.service.impl;

import com.example.homework002.model.entity.Student;
import com.example.homework002.repository.StudentRepository;
import com.example.homework002.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.getAllStudent();
    }
}
