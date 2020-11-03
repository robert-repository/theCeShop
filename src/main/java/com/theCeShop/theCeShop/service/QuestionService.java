package com.theCeShop.theCeShop.service;

import com.theCeShop.theCeShop.model.Question;

import java.util.List;

public interface QuestionService {

    public Question createQuestion(Question question);
    public Question findQuestion(Long id);
    public List<Question> viewAllQuestion();
}
