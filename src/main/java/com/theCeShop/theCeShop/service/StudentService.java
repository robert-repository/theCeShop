package com.theCeShop.theCeShop.service;

import com.theCeShop.theCeShop.model.Student;

import java.util.List;

public interface StudentService {

    public Student createStudent(Student student);
    public List<Student> getAllStudent();
    public Student findStudent(Long id);

}
