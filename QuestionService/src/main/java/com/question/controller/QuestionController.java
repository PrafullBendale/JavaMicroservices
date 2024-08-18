package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuestionService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    //CREATE QUESTION
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    //GET ALL QUESTIONS
    @GetMapping
    public List<Question> getAll(){
        return questionService.getall();
    }


    //GET ONE QUESTION
    @GetMapping("/{questionId}")
    public Question get(@PathVariable Long questionId){
        return questionService.get(questionId);
    }

    //GET ALL QUESTIONS OF SAME QUIZ ID
    @GetMapping("/quiz/{quizId}")
    public List<Question> getAllByQuizId(@PathVariable Long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
