package com.newtest.newtest.servise;

import com.newtest.newtest.model.Student;
import com.newtest.newtest.repository.StudentRepository;
import org.springframework.stereotype.Service;



import java.util.Collection;
import java.util.Optional;

@Service
public class StudentServis {
 private final StudentRepository studentRepository;

    public StudentServis(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student add(Student student){
        return studentRepository.save(student);
    }
    public Student get(Long id){
        return studentRepository.findById(id).get();
    }
    public void delete(Long id){
        studentRepository.deleteById(id);
    }
    public Student update(Student student) {
        return studentRepository.save(student);

    }
    public Collection<Student>getAll(Student student){
        return studentRepository.findAll();
    }
    public Collection<Student> byAge(int age) {
        return studentRepository.findAge(age);
    }


}
