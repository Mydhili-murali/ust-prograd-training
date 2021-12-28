package mydhili.JpaDemo.Service;

import mydhili.JpaDemo.Entity.Student;
import mydhili.JpaDemo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

     public Student saveStudent(Student student){
         // validations // error checkings...
         return repo.save(student);

     }
     public List<Student> listAll(){
         return repo.findAll();
     }

}
