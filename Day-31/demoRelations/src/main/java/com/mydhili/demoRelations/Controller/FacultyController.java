package com.mydhili.demoRelations.Controller;

import com.mydhili.demoRelations.Entity.Faculty;
import com.mydhili.demoRelations.Entity.Student;
import com.mydhili.demoRelations.Service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
public class FacultyController {
    @Autowired
    private FacultyService facultyService;
    @GetMapping("/faculties")
    public List<Faculty> list(){

        return facultyService.getAllFaculties();
    }

    @GetMapping("/faculty/new")  //localhost:3000/student/new?name=mydhili&age=24
    public Faculty createFaculty(HttpServletRequest request){
        String name=request.getParameter("name");
        Faculty faculty=new Faculty(name);
        return facultyService.saveFaculty(faculty);
    }
    @GetMapping("/faculty/{id}")
    public Faculty getFaculty(@PathVariable Long id){
        return facultyService.getFacultyById(id);
    }

}
