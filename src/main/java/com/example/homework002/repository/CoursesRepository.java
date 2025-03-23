package com.example.homework002.repository;

import com.example.homework002.model.entity.Courses;
import com.example.homework002.model.entity.CoursesRequest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CoursesRepository {

    @Results(id = "coursesMapper",
            value = {
            @Result(property = "id", column = "course_id"),
                    @Result(property = "instructor",column = "instructor_id", one = @One(select = "com.example.homework002.repository.InstructorRepository.getAllInstructorById"))
    })
    @Select("""
        SELECT * FROM  courses;
    """)
    List<Courses> getAllCourse();


    @ResultMap("coursesMapper")
    @Select("""
        INSERT INTO courses VALUES (default, #{req.course_name}, #{req.description}, #{req.instructor}) RETURNING *;
    """)
    Courses saveAllCourses(@Param("req") CoursesRequest coursesRequest);

    @ResultMap("coursesMapper")
    @Select("""
        SELECT * FROM courses WHERE course_id = #{coursesId} RETURNING *;
    """)
    Courses getAllCourseById(Long coursesId);

    @ResultMap("coursesMapper")
    @Select("""
        DELETE FROM courses WHERE course_id = #{coursesId} RETURNING *;
    """)
    Courses getDeleteCourseById(Long coursesId);

    @Select("""
        UPDATE courses SET course_name = #{req.course_name}, description = #{req.description}, instructor_id = #{req.instructor} WHERE course_id = #{coursesId} RETURNING *;
        RETURN *;
    """
    )
    Courses getUpdateCourseById(Long courseId, @Param("req") CoursesRequest coursesRequest);
}
