package com.question.services;

import com.question.entities.QuestionEntity;
import com.question.model.RequestDTO;
import com.question.model.ResponseDTO;

import java.util.List;

public interface QuestionService {
    ResponseDTO create (RequestDTO question);
    List<QuestionEntity> getall();
    QuestionEntity get(Long id);
    List<QuestionEntity> getQuestionsOfQuiz(Long quizId);
}
