INSERT INTO students(student_name, email, phone_number) VALUES ('soriya','soriya@gmail.com','012411409');

INSERT INTO instructors(instructor_name, email) VALUES ('Chea Menglim','cheamenglim@gmail.com');

UPDATE instructors SET instructor_name = 'Seav lang', email = 'seavlang@gmail.com' WHERE instructor_id = 3;

INSERT INTO courses(course_name, description, instructor_id) VALUES ('Math','Althimathic calculation', 3);

INSERT INTO student_course(student_id, course_id) VALUES (1,2),(2, 3),(3, 4),(4, 4),(5,5);

SELECT * FROM student_course bc INNER JOIN students s ON bc.course_id = s.student_id;


SELECT * FROM student_course bc INNER JOIN students s ON bc.course_id = s.student_id WHERE course_id = 3;
