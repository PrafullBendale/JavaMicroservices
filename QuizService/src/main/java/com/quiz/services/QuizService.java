package com.quiz.services;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepository;

import java.util.List;

public interface QuizService {

    Quiz create(Quiz quiz);
    List<Quiz> getall();
    Quiz get(Long id);

}
