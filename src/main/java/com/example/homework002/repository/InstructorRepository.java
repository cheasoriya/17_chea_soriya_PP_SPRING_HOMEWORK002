package com.example.homework002.repository;

import com.example.homework002.model.entity.Courses;
import com.example.homework002.model.entity.InstructorRequest;
import com.example.homework002.model.entity.Instuctors;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface InstructorRepository {

    @Result(property = "id",column = "instructor_id")
    @Select("""
        SELECT * FROM instructors
        OFFSET #{offset} LIMIT #{size};
    """)
    List<Instuctors> getAllInstructor(int offset, Integer size);

    @Result(property = "id",column = "instructor_id")
    @Select("""
        INSERT INTO instructors (instructor_name, email) values (#{req.instructor_name}, #{req.email}) RETURNING *;
    """)
    Instuctors saveAllInstructor(@Param("req") InstructorRequest instructorRequest);

    @Result(property = "id",column = "instructor_id")

    @Select("""
        SELECT  * FROM instructors WHERE instructor_id = #{instructorId}
    """
    )
    Instuctors getAllInstructorById(Long instructorId);

    @Result(property = "id",column = "instructor_id")
    @Select("""
        DELETE FROM instructors WHERE instructor_id = #{instructorId} RETURNING *
    """)
    Instuctors deleteAllInstructorById(Long instructorId);

    @Select("""
           UPDATE instructors SET  instructor_name = #{req.instructor_name}, email = #{req.email}  WHERE instructor_id = #{instructorId} RETURNING *
       """
    )
    Instuctors updateAllInstructorById( Long instructorId,@Param("req") InstructorRequest instructorRequest);

}
