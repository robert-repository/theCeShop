package com.theCeShop.theCeShop.controller;

import com.theCeShop.theCeShop.model.Question;
import com.theCeShop.theCeShop.service.QuestionService;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public ResponseEntity<?> createQuestion(@RequestBody Question question){
        return new ResponseEntity<Question>(questionService.createQuestion(question), HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity<?> getQuestions(){
        return new  ResponseEntity<List<Question>>(questionService.viewAllQuestion(), HttpStatus.OK);
    }
}
