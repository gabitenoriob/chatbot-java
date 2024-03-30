package com.chatbotjava.domain.models;

public record Champions(  Long id,
                          String name,
                          String lore,
                          String role,
                          String imageUrl) {
    public String generateContextByQuestion(String question){
        return """
        Pergunta: %s
        Nome do Campeão: %s
        Função: %s
        História: %s
        """.formatted(question,this.name,this.role,this.lore);
    }
}

