package com.mydhili.demoRelations.Repository;

import com.mydhili.demoRelations.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
