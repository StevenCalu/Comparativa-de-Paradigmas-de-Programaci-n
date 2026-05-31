package com.espe.Autonomo_1P.domain.service;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface TechAIService {

    @UserMessage("""
        Genera un resumen ejecutivo del inventario:

        {{texto}}

        Usa menos 120 caracteres.
        """)
    String generateSummary(String texto);

}