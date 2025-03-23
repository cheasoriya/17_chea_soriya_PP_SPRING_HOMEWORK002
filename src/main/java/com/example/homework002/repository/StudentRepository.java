package com.example.homework002.repository;

import com.example.homework002.model.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentRepository {


    @Results(id = "studentMapper",
            value = {
                    @Result(property = "id", column = "student_id"),
                    @Result(property = "student_phone", column = "phone_number"),
                    @Result(property = "student_courses",column = "student_id", one = @One(select = "com.example.homework002.repository.CoursesRepository.getAllCourse")),
                    @Result(property = "student_courses",column = "course_id", many = @Many(select = "com.example.homework002.repository.StudentRepository.getAllStudentByCourseID"))
            })
    @Select("""
    SELECT * FROM students;
            """
    )
    List<Student> getAllStudent();


    @Select("""
        SELECT * FROM student_course bc INNER JOIN students s ON bc.course_id = s.student_id WHERE course_id = #{courseID};
    """)
    List<Student> getAllStudentByCourseID(Long courseId);
}
