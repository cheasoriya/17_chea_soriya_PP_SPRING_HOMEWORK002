package com.example.homework002.controller;

import com.example.homework002.model.entity.InstructorRequest;
import com.example.homework002.model.entity.Instuctors;
import com.example.homework002.service.InstructorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/instructor")
public class InstructorsController {

    private final InstructorService instructorService;


    public InstructorsController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping
    public List<Instuctors> getStudents(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {

        return instructorService.getAllInstuctors(page, size);
    }
    
    @PostMapping
    public Instuctors saveInstuctors(@RequestBody InstructorRequest instructorRequest) {
        return instructorService.saveAllInstructors(instructorRequest);
    }

    @GetMapping("/{instructor-id}")
    public Instuctors getInstuctorById(@PathVariable("instructor-id") Long instructorId) {
        return instructorService.getAllInstuctorById(instructorId);
    }

    @DeleteMapping("/{instructor-id}")
    public Instuctors deleteInstructorById(@PathVariable("instructor-id") Long instructorId) {
        return instructorService.deleteInstructorById(instructorId);
    }

    @PutMapping("/{instructor-id}")
    public Instuctors updateInstructorById(@PathVariable("instructor-id") Long instructorId, @RequestBody InstructorRequest instructorRequest) {
        return instructorService.updateInstructorById(instructorId, instructorRequest);
    }
}
