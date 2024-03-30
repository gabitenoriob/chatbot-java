package com.chatbotjava.domain.exception;

public class ChampionsNotFoundException extends  RuntimeException{

    public ChampionsNotFoundException(Long championId){
        super("Champion not found");
    }

}
