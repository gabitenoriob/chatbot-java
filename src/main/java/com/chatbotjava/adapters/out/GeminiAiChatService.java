package com.chatbotjava.adapters.out;

import com.chatbotjava.domain.ports.GenerativeAiApi;
import feign.FeignException;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@ConditionalOnProperty(name = "generative-ai.provider", havingValue = "OPENAI", matchIfMissing = true)
@FeignClient(name = "geminiApi", url = "${gemini.base-url}", configuration = GeminiAiChatService.Config.class)
public interface GeminiAiChatService extends GenerativeAiApi {

    @PostMapping("/v1beta/models/gemini-pro:generateContent")
    GeminiResp textOnlyInput(GeminiReq req);

    @Override
    default String generateContent(String objective, String context) {
        String prompt = """
                %s
                %s
                """.formatted(objective,context);

        GeminiReq req = new GeminiReq(List.of(
                new Content(List.of(new Part(prompt)))
        ));

        GeminiResp resp = textOnlyInput(req);

        return resp.candidates().getFirst().content().parts().getFirst().text();
    }

    record GeminiReq(List<Content> contents) { }
    record Content(List<Part> parts) { }
    record Part(String text) { }
    record GeminiResp(List<Candidate> candidates) { }
    record Candidate(Content content){}

    class Config {
        @Bean
        public RequestInterceptor apiKeyRequestInterceptor(@Value("${gemini.api-key}") String apiKey) {
            return requestTemplate -> requestTemplate.query("key", apiKey);
        }
    }
}