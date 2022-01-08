package com.mydhili.demoRelations.Repository;

import com.mydhili.demoRelations.Entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
}
