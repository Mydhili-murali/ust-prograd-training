package com.mydhili.demoRelations.Service;
import com.mydhili.demoRelations.Entity.Student;
import com.mydhili.demoRelations.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public List<Student>getAllStudents(){
        return studentRepo.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student getStudentById(Long studentId) {
        return studentRepo.findById(studentId).get();
    }
}
