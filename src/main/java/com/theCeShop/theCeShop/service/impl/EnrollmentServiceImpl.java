package com.theCeShop.theCeShop.service.impl;

import com.theCeShop.theCeShop.model.Enrollment;
import com.theCeShop.theCeShop.repo.EnrollmentRepo;
import com.theCeShop.theCeShop.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl  implements EnrollmentService {

    @Autowired
    private EnrollmentRepo enrollmentRepo;

    @Override
    public Enrollment createEnrollment(Enrollment enrollment) {
        return enrollmentRepo.save(enrollment);
    }

    @Override
    public Enrollment findEnrollment(Long id) {
        return enrollmentRepo.findById(id).get();
    }

    @Override
    public List<Enrollment> viewAllEnrollment() {
        return enrollmentRepo.findAll();
    }
}
