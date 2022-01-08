package com.mydhili.demoRelations.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer age;
    @JsonIgnore
    @ManyToOne
    private Faculty faculty;
@JsonIgnore
    @ManyToMany
    private List<Course> courses;
    public Student() {
    }
    public Student( String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public void addCourse(Course course){
        this.courses.add(course);
    }
}
