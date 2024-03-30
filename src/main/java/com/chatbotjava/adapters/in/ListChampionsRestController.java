package com.chatbotjava.adapters.in;

import com.chatbotjava.application.ListChampionsUseCase;
import com.chatbotjava.domain.models.Champions;
import org.junit.jupiter.api.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champions> findAllChampions(){
        return  useCase.findAll();
    }
}
