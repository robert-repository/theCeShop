package com.theCeShop.theCeShop.controller;

import com.theCeShop.theCeShop.model.Student;
import com.theCeShop.theCeShop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<?> viewStudents(){
        return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
    }
}
