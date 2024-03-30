package com.chatbotjava.application;

import com.chatbotjava.domain.models.Champions;
import com.chatbotjava.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {


    public List<Champions> findAll(){
        return  repository.findAll();
    }

}
