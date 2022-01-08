package com.mydhili.demoRelations.Controller;
import com.mydhili.demoRelations.Entity.Course;
import com.mydhili.demoRelations.Entity.Faculty;
import com.mydhili.demoRelations.Entity.Student;
import com.mydhili.demoRelations.Service.CourseService;
import com.mydhili.demoRelations.Service.FacultyService;
import com.mydhili.demoRelations.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController{
@Autowired
    private StudentService studentService;

@Autowired
private FacultyService facultyService;

@Autowired
private CourseService courseService;
@GetMapping("/students")
    public List<Student> list(){

    return studentService.getAllStudents();
}

@GetMapping("/student/new")  //localhost:3000/student/new?name=mydhili&age=24
    public Student createStudent(HttpServletRequest request){
    String name=request.getParameter("name");
    Integer age=Integer.parseInt(request.getParameter("age"));
    Student student=new Student(name,age);
    return studentService.saveStudent(student);
}

@GetMapping("/student/{studentId}/assign-faculty/{facultyId}")  //localhost:3000/student/2/assign-faculty/2
public Student assignFaculty(@PathVariable Long studentId,@PathVariable Long facultyId, Model model){
    Student student=studentService.getStudentById(studentId);
    Faculty faculty=facultyService.getFacultyById(facultyId);
    student.setFaculty(faculty);
    return studentService.saveStudent(student);
}
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @GetMapping("/student/{studentId}/add-course/{courseId}")  //localhost:3000/student/2/assign-faculty/2
    public Student addCourse(@PathVariable Long studentId,@PathVariable Long courseId, Model model){
        Student student=studentService.getStudentById(studentId);
        Course course=courseService.getCourseById(courseId);
        student.addCourse(course);
        return studentService.saveStudent(student);
    }
}
