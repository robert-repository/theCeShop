package com.theCeShop.theCeShop.service.impl;

import com.theCeShop.theCeShop.model.Course;
import com.theCeShop.theCeShop.repo.CourseRepo;
import com.theCeShop.theCeShop.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public Course createCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course findCourse(Long id) {
        return courseRepo.findById(id).get();
    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepo.findAll();
    }
}
