package com.theCeShop.theCeShop.controller;

import com.theCeShop.theCeShop.model.Enrollment;
import com.theCeShop.theCeShop.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @PostMapping
    public ResponseEntity<?> createEnrollment(@RequestBody Enrollment enrollmnet){
        return new ResponseEntity<Enrollment>(enrollmentService.createEnrollment(enrollmnet), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<?> viewAll(){
        return new ResponseEntity<List<Enrollment>>(enrollmentService.viewAllEnrollment(), HttpStatus.OK);
    }
}
