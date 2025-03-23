package com.example.homework002.service.impl;

import com.example.homework002.model.entity.InstructorRequest;
import com.example.homework002.model.entity.Instuctors;
import com.example.homework002.repository.InstructorRepository;
import com.example.homework002.service.InstructorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {


    private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instuctors> getAllInstuctors(Integer page, Integer size) {
        int offset = (page - 1) * size;
        return instructorRepository.getAllInstructor(offset, size);
    }

    @Override
    public Instuctors saveAllInstructors(InstructorRequest instructorRequest) {
        return instructorRepository.saveAllInstructor(instructorRequest);
    }

    @Override
    public Instuctors getAllInstuctorById(Long instructorId) {
        return instructorRepository.getAllInstructorById(instructorId);
    }

    @Override
    public Instuctors deleteInstructorById(Long instructorId) {
        return instructorRepository.deleteAllInstructorById(instructorId);
    }

    @Override
    public Instuctors updateInstructorById(Long instructorId, InstructorRequest instructorRequest) {
        return instructorRepository.updateAllInstructorById(instructorId, instructorRequest);
    }


}
