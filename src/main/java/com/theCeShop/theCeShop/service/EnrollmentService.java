package com.theCeShop.theCeShop.service;

import com.theCeShop.theCeShop.model.Enrollment;

import java.util.List;

public interface EnrollmentService {

    public Enrollment createEnrollment(Enrollment enrollment);
    public Enrollment findEnrollment(Long id);
    public List<Enrollment> viewAllEnrollment();
}
