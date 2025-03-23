package com.example.homework002.service;

import com.example.homework002.model.entity.Courses;
import com.example.homework002.model.entity.CoursesRequest;

import java.util.List;

public interface CourseService {

    List<Courses> getAllCourse();

    Courses saveCourses(CoursesRequest coursesRequest);

    Courses getAllCourseById(Long coursesId);

    Courses getDeleteCourseById(Long coursesId);

    Courses getUpdateCourseById(Long courseId, CoursesRequest coursesRequest);
}
