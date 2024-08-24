package com.question.controller;

import com.question.entities.QuestionEntity;
import com.question.model.RequestDTO;
import com.question.model.ResponseDTO;
import com.question.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    //CREATE QUESTION
    @PostMapping
    public ResponseDTO create(@RequestBody RequestDTO requestDTO){
        ResponseDTO response = questionService.create(requestDTO);
        return response;
    }

    //GET ALL QUESTIONS
    @GetMapping
    public List<QuestionEntity> getAll(){
        return questionService.getall();
    }


    //GET ONE QUESTION
    @GetMapping("/{questionId}")
    public QuestionEntity get(@PathVariable Long questionId){
        return questionService.get(questionId);
    }

    //GET ALL QUESTIONS OF SAME QUIZ ID
    @GetMapping("/quiz/{quizId}")
    public List<QuestionEntity> getAllByQuizId(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
