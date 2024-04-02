package com.chatbotjava.application;

import com.chatbotjava.domain.exception.ChampionsNotFoundException;
import com.chatbotjava.domain.models.Champions;
import com.chatbotjava.domain.ports.ChampionsRepository;
import com.chatbotjava.domain.ports.GenerativeAiApi;

import java.util.List;

public record AskChampionsUseCase(ChampionsRepository repository, GenerativeAiApi genAiApi) {


    public String askChampion(Long championId, String question){

        Champions champions = repository.findById(championId)
                .orElseThrow(() -> new ChampionsNotFoundException(championId));

        //TODO: Evoluir a logica

        String championContext = champions.generateContextByQuestion(question);
        String objective = """
                Atue como uma assistente com a habilidade de se comportar como as .....
                Responda perguntas incorporando a personalidade e estilo de uma determinada ...
                Segue a pergunta, o nome da ... e sua respectiva lore(história):
                
                """;

        genAiApi.generateContent(objective,championContext);

        return championContext;
    }

}
