package com.theCeShop.theCeShop.service;

import com.theCeShop.theCeShop.model.Course;

import java.util.List;

public interface CourseService {
    public Course createCourse(Course course);
    public Course findCourse(Long id);
    public List<Course> getAllCourse();
}
