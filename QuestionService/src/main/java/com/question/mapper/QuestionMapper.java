package com.question.mapper;

import com.question.entities.QuestionEntity;
import com.question.model.RequestDTO;
import com.question.model.ResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class QuestionMapper {
    public QuestionEntity toEntity(RequestDTO requestDTO) {
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setQuestion(requestDTO.getQuestion());
        questionEntity.setQuizId(requestDTO.getQuizId());
        return questionEntity;
    }

    public ResponseDTO toDTO(QuestionEntity questionEntity) {
        ResponseDTO dto = new ResponseDTO();
        dto.setId(questionEntity.getQuestionId());
        dto.setQuestion(questionEntity.getQuestion());
        dto.setQuizId(questionEntity.getQuizId());
        return dto;
    }
}
