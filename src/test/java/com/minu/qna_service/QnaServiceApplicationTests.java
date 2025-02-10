package com.minu.qna_service;

import com.minu.qna_service.boundedContext.question.Question;
import com.minu.qna_service.boundedContext.repository.QuestionRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class QnaServiceApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    @DisplayName("데이터 저장하기")
    void t001() {
        Question q1 = new Question();
        q1.setSubject("sbs가 무엇인가요?");
        q1.setContent("sbs에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("스프링부트에 대한 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        questionRepository.save(q2);
    }

}
