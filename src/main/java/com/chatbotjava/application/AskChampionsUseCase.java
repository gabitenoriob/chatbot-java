package com.chatbotjava.application;

import com.chatbotjava.domain.exception.ChampionsNotFoundException;
import com.chatbotjava.domain.models.Champions;
import com.chatbotjava.domain.ports.ChampionsRepository;

import java.util.List;

public record AskChampionsUseCase(ChampionsRepository repository) {


    public String askChampion(Long championId, String question){

        Champions champions = repository.findById(championId)
                .orElseThrow(() -> new ChampionsNotFoundException(championId));

        //TODO: Evoluir a logica
        return champions.generateContextByQuestion(question);
    }

}
