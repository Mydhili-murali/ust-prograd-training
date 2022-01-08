package com.mydhili.demoRelations.Service;

import com.mydhili.demoRelations.Entity.Faculty;
import com.mydhili.demoRelations.Repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FacultyService {
    @Autowired
    private FacultyRepository repo;


    public List<Faculty> getAllFaculties() {
        return repo.findAll();
    }

    public Faculty saveFaculty(Faculty faculty) {
        return repo.save(faculty);
    }

    public Faculty getFacultyById(Long facultyId) {
        return repo.findById(facultyId).get();
    }
}
