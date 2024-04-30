package com.newtest.newtest.repository;

import com.newtest.newtest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
//@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public Collection<Student> findAge(int age);
}
