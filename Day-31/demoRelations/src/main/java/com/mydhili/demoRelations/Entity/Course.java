package com.mydhili.demoRelations.Entity;

import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.List;

@Entity

public class Course {
    @Id
    @GeneratedValue
    private Long courseId;
    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    public Course() {
    }

    public Course( String name) {

        this.name = name;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
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
