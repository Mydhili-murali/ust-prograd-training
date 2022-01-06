package com.mydhili.demoRepoTest.Controller;

import com.mydhili.demoRepoTest.Entity.Student;
import com.mydhili.demoRepoTest.Service.StudentService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student>list(){
        return service.getAllStudents();
    }
    @GetMapping("/students/new")  //localhost:8080/students/new?name="Mydhili"&email="mydhili@gmail.com"&age=24
    public Student create(HttpServletRequest request){
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        Integer age=Integer.parseInt(request.getParameter("age"));
        Student student=new Student(name,email,age);
        return service.createStudent(student);
    }

    @GetMapping("students/check/email/{email}")  //localhost:8080/students/check/email/mydhili@gmail.com
    public Boolean checkIfEmailExists(@PathVariable String email){

        return service.checkIfEmailExists(email);
    }

}
