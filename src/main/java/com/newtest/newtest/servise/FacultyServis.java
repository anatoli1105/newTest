package com.newtest.newtest.servise;

import com.newtest.newtest.model.Faculty;
import com.newtest.newtest.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class FacultyServis {
 private final FacultyRepository facultyRepository;

    public FacultyServis(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty add(Faculty faculty){
        return facultyRepository.save(faculty);
    }
    public Faculty get(Faculty faculty){
        return facultyRepository.save(faculty);
    }
    public void delete(Long id){
        facultyRepository.deleteById(id);
    }
    public Optional<Faculty> update(Long id) {

        return  facultyRepository.findById(id);
    }

    public Collection<Faculty> getAll(Faculty faculty) {

        return facultyRepository.findAll();
    }


    public Collection<Faculty> colorFaculty(String color) {
        return facultyRepository.findColor(color);
    }

}
