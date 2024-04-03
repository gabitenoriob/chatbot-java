package com.chatbotjava.domain.exception;

public class ChampionsNotFoundException extends  RuntimeException{

    public class ChampionNotFoundException extends RuntimeException {

        public ChampionNotFoundException(Long championId) {
            super("Woman %d not found.".formatted(championId));
        }
    }
}
