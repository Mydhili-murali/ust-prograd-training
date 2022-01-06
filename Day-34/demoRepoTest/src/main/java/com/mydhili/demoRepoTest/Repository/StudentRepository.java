package com.mydhili.demoRepoTest.Repository;

import com.mydhili.demoRepoTest.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Long> {

    //public Boolean existsByEmail(String email);
    @Query(
           " SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END " +
                   " FROM Student s WHERE s.email= ?1 "
    )       //s.email=?1 ==>1st parameter value in the below function call
    public Boolean checkIfEmailExists(String email);
}
