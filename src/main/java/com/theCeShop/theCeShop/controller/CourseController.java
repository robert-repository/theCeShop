package com.theCeShop.theCeShop.controller;

import com.theCeShop.theCeShop.model.Course;
import com.theCeShop.theCeShop.model.Enrollment;
import com.theCeShop.theCeShop.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<?> createCourse(@RequestBody Course course){
        return new ResponseEntity<Course>(courseService.createCourse(course), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<?> viewAllCourses(){
        return new ResponseEntity<List<Course>>(courseService.getAllCourse(), HttpStatus.OK);
    }

}
