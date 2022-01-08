package com.mydhili.demoRelations.Service;
import com.mydhili.demoRelations.Entity.Course;
import com.mydhili.demoRelations.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepo;


    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    public Course getCourseById(Long id) {
        return courseRepo.findById(id).get();
    }
}
