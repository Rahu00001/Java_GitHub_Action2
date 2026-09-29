package com.stud.student_management_22.repository;

import com.stud.student_management_22.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/*
     Student → entity we are working with
     Long → type of the primary key
*/

public interface StudentRepository extends JpaRepository<Student, Long> {
/*you will automatically get following methods:
* save()
* findAll()
* findById()
* deleteById()
* existsById()
* */
}
