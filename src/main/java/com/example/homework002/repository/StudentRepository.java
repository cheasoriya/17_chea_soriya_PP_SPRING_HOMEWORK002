package com.example.homework002.repository;

import com.example.homework002.model.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentRepository {

    @Result(property = "id", column = "student_id")
    @Result(property = "student_phone", column = "phone_number")
//    @Result(property = "")
    @Select("""
    SELECT * FROM students;
            """
    )
    List<Student> getAllStudent();

//    @Result(property = "", column = "")
    @Select("""
        SELECT * FROM student_course bc INNER JOIN students s ON bc.course_id = s.student_id WHERE course_id = #{courseID};
    """)
    List<Student> getAllStudentByCourseID(Long courseId);


}
