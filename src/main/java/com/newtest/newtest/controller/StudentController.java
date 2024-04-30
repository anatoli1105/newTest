package com.newtest.newtest.controller;

import com.newtest.newtest.servise.StudentServis;
import org.springframework.web.bind.annotation.*;
import com.newtest.newtest.model.Student;


import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    private final StudentServis studentServis;

    public StudentController(StudentServis studentServis) {
        this.studentServis = studentServis;


    }
    @PostMapping(path = "/add")
    public Student add(@RequestBody Student student){
        return studentServis.add(student);
    }
    @GetMapping(path = "/get")
    public Student get(@RequestParam Long id){
        return studentServis.get(id);
    }
    @DeleteMapping(path = "/delete")
    public void delete(@RequestParam Long id){
         studentServis.delete(id);
    }
    @PutMapping(path = "/udate")
    public Student update(@RequestParam Student student){
        return studentServis.update(student);
    }

    @GetMapping
    public Collection<Student> getAllStudent(@RequestParam Student student){
        return studentServis.getAll(student);
    }

    @GetMapping(path = "/age")
    public Collection<Student> ageFilter(@RequestParam int age) {
        return studentServis.byAge(age);

    }

    }