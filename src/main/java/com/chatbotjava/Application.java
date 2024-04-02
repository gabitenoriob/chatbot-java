package com.chatbotjava;

import com.chatbotjava.application.AskChampionsUseCase;
import com.chatbotjava.application.ListChampionsUseCase;
import com.chatbotjava.domain.ports.ChampionsRepository;
import com.chatbotjava.domain.ports.GenerativeAiApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
@EnableFeignClients
@SpringBootApplication
public class Application {

	//TODO: deploy AWS

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository repository){
		return new ListChampionsUseCase(repository);
	}
	@Bean
	public AskChampionsUseCase provideAskChampionsUseCase(ChampionsRepository repository, GenerativeAiApi genAiApi){
		return new AskChampionsUseCase(repository,genAiApi);
	}

}
