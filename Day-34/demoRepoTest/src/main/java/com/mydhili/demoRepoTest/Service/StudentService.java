package com.mydhili.demoRepoTest.Service;

import com.mydhili.demoRepoTest.Entity.Student;
import com.mydhili.demoRepoTest.Repository.StudentRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student createStudent(Student student) {
        return repo.save(student);
    }

    public Student getStudentById(Long id) {
        return repo.findById(id).get();
    }

//        public Boolean checkIfEmailExists(String email) {
//        return repo.existsByEmail(email);
//    }
    public Boolean checkIfEmailExists(String email) {
        return repo.checkIfEmailExists(email);
    }

}
