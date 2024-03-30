package com.chatbotjava;

import com.chatbotjava.application.ListChampionsUseCase;
import com.chatbotjava.domain.models.Champions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

import java.util.List;

@SpringBootTest
public class ListChampionsUseCaseIntegrationTest {

    @Autowired
    private ListChampionsUseCase listChampionsUseCase;
    @Test
    public  void testListChampions(){
        List<Champions> champions = listChampionsUseCase.findAll();

        Assertions.assertEquals(12,champions.size());
    }
}
