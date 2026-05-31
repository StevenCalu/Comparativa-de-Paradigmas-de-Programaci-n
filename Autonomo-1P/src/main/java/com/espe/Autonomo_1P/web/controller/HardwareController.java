package com.espe.Autonomo_1P.web.controller;

import com.espe.Autonomo_1P.domain.service.HardwareService;
import com.espe.Autonomo_1P.domain.service.TechAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hardware")
public class HardwareController {

    private final HardwareService service;

    private final TechAIService aiService;

    public HardwareController(
            HardwareService service,
            TechAIService aiService) {

        this.service = service;
        this.aiService = aiService;
    }

    @GetMapping("/imperativo")
    public Object imperativo() {

        return service.reporteImperativo();
    }

    @GetMapping("/funcional")
    public Object funcional() {

        return service.reporteFuncional();
    }

    @GetMapping("/resumen")
    public String resumen() {

        return aiService.generateSummary(
                "Inventario procesado correctamente");
    }
}