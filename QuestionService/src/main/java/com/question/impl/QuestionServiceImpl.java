package com.question.impl;

import com.question.entities.QuestionEntity;
import com.question.mapper.QuestionMapper;
import com.question.model.RequestDTO;
import com.question.model.ResponseDTO;
import com.question.repositories.QuestionRepository;
import com.question.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionMapper mapper;

    public QuestionServiceImpl(QuestionRepository questionRepository, QuestionMapper mapper) {
        this.questionRepository = questionRepository;
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO create(RequestDTO requestDTO) {
        QuestionEntity questionEntity = questionRepository.save(mapper.toEntity(requestDTO));
        ResponseDTO responseDTO = mapper.toDTO(questionEntity);
        return responseDTO;
    }

    @Override
    public List<QuestionEntity> getall() {
        return questionRepository.findAll();
    }

    @Override
    public QuestionEntity get(Long id) {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question Not Found"));
    }

    @Override
    public List<QuestionEntity> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
