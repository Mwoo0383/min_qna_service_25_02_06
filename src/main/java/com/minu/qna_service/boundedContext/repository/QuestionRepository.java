package com.minu.qna_service.boundedContext.repository;

import com.minu.qna_service.boundedContext.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
