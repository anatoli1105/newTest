package com.newtest.newtest.controller;

import com.newtest.newtest.model.Faculty;
import com.newtest.newtest.servise.FacultyServis;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/faculty")
public class FacultyController {
    private final FacultyServis facultyServis;


    public FacultyController(FacultyServis facultyServis) {
        this.facultyServis = facultyServis;
    }
}