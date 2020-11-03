package com.theCeShop.theCeShop.repo;

import com.theCeShop.theCeShop.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Long> {
}
