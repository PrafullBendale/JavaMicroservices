package com.question.services;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;

import java.util.List;

public interface QuestionService {
    Question create (Question question);
    List<Question> getall();
    Question get(Long id);
    List<Question> getQuestionsOfQuiz(Long quizId);
}
