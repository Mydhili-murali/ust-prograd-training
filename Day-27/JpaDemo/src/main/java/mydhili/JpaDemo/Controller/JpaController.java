package mydhili.JpaDemo.Controller;

import mydhili.JpaDemo.Entity.Student;
import mydhili.JpaDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class JpaController {
    @Autowired
    private StudentService service;

    @RequestMapping("/")
    public String index(){
        Student student1 = new Student("Mydhili","CSE",98.0f,24,"9874563456");
        service.saveStudent(student1);
        return "Student saved";
    }

    @RequestMapping("/list")
    public List<Student> list(){
        return service.listAll();
    }
    @RequestMapping("/create")
    public Student create(HttpServletRequest req)
    {
        String name=req.getParameter("name");
        String phoneNumber=req.getParameter("phoneNumber");
        Student student=new Student(name,"CSE",95.0f,29,phoneNumber);
        return service.saveStudent(student);
    }
}
