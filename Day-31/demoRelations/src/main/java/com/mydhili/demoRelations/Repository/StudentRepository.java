package com.mydhili.demoRelations.Repository;

import com.mydhili.demoRelations.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
