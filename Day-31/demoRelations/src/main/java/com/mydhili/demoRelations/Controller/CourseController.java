package com.mydhili.demoRelations.Controller;

import com.mydhili.demoRelations.Entity.Course;
import com.mydhili.demoRelations.Entity.Student;
import com.mydhili.demoRelations.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/courses")
    public List<Course> list(){

        return courseService.getAllCourses();
    }

    @GetMapping("/course/new")  //localhost:3000/student/new?name=mydhili&age=24
    public Course createCourse(HttpServletRequest request){
        String name=request.getParameter("name");
        Course course=new Course(name);
        return courseService.saveCourse(course);
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Long id){
        return courseService.getCourseById(id);
    }
}
