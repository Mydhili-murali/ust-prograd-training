package com.mydhili.demoRelations.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private Long facultyId;
    @Column(nullable=false)
    private String name;

    @OneToMany(mappedBy = "faculty")
    private List<Student>students;

    public Faculty() {
    }

    public Faculty(String name) {
        this.name = name;
    }

    public Long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Long facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
