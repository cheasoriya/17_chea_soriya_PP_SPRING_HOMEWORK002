package com.example.homework002.service;

import com.example.homework002.model.entity.InstructorRequest;
import com.example.homework002.model.entity.Instuctors;

import java.util.List;

public interface InstructorService {

    List<Instuctors> getAllInstuctors(Integer page, Integer size);

    Instuctors saveAllInstructors(InstructorRequest instructorRequest);

    Instuctors getAllInstuctorById(Long instructorId);

    Instuctors deleteInstructorById(Long instructorId);

    Instuctors updateInstructorById(Long instructorId, InstructorRequest instructorRequest);
}
