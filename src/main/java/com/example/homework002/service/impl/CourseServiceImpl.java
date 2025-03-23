package com.example.homework002.service.impl;

import com.example.homework002.model.entity.Courses;
import com.example.homework002.model.entity.CoursesRequest;
import com.example.homework002.repository.CoursesRepository;
import com.example.homework002.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private final CoursesRepository coursesRepository;
    public CourseServiceImpl(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @Override
    public List<Courses> getAllCourse() {
        return coursesRepository.getAllCourse();
    }

    @Override
    public Courses saveCourses(CoursesRequest coursesRequest) {
        return coursesRepository.saveAllCourses(coursesRequest);
    }

    @Override
    public Courses getAllCourseById(Long coursesId) {
        return coursesRepository.getAllCourseById(coursesId);
    }

    @Override
    public Courses getDeleteCourseById(Long coursesId) {
        return coursesRepository.getDeleteCourseById(coursesId);
    }

    @Override
    public Courses getUpdateCourseById(Long courseId, CoursesRequest coursesRequest) {
        return coursesRepository.getUpdateCourseById(courseId,coursesRequest);
    }
}
