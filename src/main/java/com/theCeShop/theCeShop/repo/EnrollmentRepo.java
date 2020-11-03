package com.theCeShop.theCeShop.repo;

import com.theCeShop.theCeShop.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepo extends JpaRepository<Enrollment, Long> {
}
