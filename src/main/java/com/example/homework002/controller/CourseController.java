package com.example.homework002.controller;

import com.example.homework002.model.entity.Courses;
import com.example.homework002.model.entity.CoursesRequest;
import com.example.homework002.model.entity.Student;
import com.example.homework002.model.entity.StudentRequest;
import com.example.homework002.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Courses> GetAllCourses() {
        return courseService.getAllCourse();
    }
    @PostMapping
    public Courses saveCourses(@RequestBody CoursesRequest coursesRequest) {
        return courseService.saveCourses(coursesRequest);
    }
    @GetMapping("/{courses-id}")
    public Courses getCourseById(@PathVariable("courses-id") Long coursesId){
        return courseService.getAllCourseById(coursesId);
    }

    @DeleteMapping("/{courses-id}")
    public Courses deleteCourseById(@PathVariable("courses-id") Long coursesId) {
        return courseService.getDeleteCourseById(coursesId);
    }

    @PutMapping("/{course-id}")
    public Courses updateCourseById(@PathVariable("course-id") Long courseId, @RequestBody CoursesRequest coursesRequest) {
        return courseService.getUpdateCourseById(courseId,coursesRequest);
    }
}
