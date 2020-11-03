package com.theCeShop.theCeShop.service.impl;

import com.theCeShop.theCeShop.model.Student;
import com.theCeShop.theCeShop.repo.StudentRepo;
import com.theCeShop.theCeShop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student findStudent(Long id) {
        return studentRepo.findById(id).get();
    }
}
