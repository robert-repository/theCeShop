package com.theCeShop.theCeShop.service.impl;

import com.theCeShop.theCeShop.model.Question;
import com.theCeShop.theCeShop.repo.QuestionRepo;
import com.theCeShop.theCeShop.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionServiceImpl implements QuestionService {


    @Autowired
    private QuestionRepo questionRepo;

    @Override
    public Question createQuestion(Question question) {
        return questionRepo.save(question);
    }

    @Override
    public Question findQuestion(Long id) {
        return questionRepo.findById(id).get();
    }

    @Override
    public List<Question> viewAllQuestion() {
        return questionRepo.findAll();
    }
}
