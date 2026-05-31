package com.espe.Autonomo_1P.domain.service;

import com.espe.Autonomo_1P.domain.service.model.Reporte;
import com.espe.Autonomo_1P.persistence.HardwareEntity;
import com.espe.Autonomo_1P.persistence.HardwareRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class HardwareService {

    private final HardwareRepository repository;

    public HardwareService(HardwareRepository repository) {
        this.repository = repository;
    }


    // IMPERATIVO

    public Map<String, Reporte> reporteImperativo() {

        List<HardwareEntity> equipos = repository.findAll();

        LocalDate limite = LocalDate.now().minusYears(5);

        Map<String, Double> totales = new HashMap<>();
        Map<String, Integer> cantidades = new HashMap<>();
        Map<String, HardwareEntity> masCaros = new HashMap<>();

        for (HardwareEntity equipo : equipos) {

            if (equipo.getEstado().equals("ACTIVO")
                    && equipo.getFechaCompra().isAfter(limite)) {

                String categoria = equipo.getCategoria();

                totales.put(
                        categoria,
                        totales.getOrDefault(categoria, 0.0)
                                + equipo.getPrecio().doubleValue()
                );

                cantidades.put(
                        categoria,
                        cantidades.getOrDefault(categoria, 0) + 1
                );

                if (!masCaros.containsKey(categoria)
                        || equipo.getPrecio().compareTo(
                        masCaros.get(categoria).getPrecio()) > 0) {

                    masCaros.put(categoria, equipo);
                }
            }
        }

        Map<String, Reporte> resultado = new HashMap<>();

        for (String categoria : totales.keySet()) {

            double total = totales.get(categoria);
            int cantidad = cantidades.get(categoria);
            double promedio = total / cantidad;

            resultado.put(
                    categoria,
                    new Reporte(
                            total,
                            promedio,
                            masCaros.get(categoria).getModelo()
                    )
            );
        }

        return resultado;
    }

    // FUNCIONAL

    public Map<String, Reporte> reporteFuncional() {

        LocalDate limite = LocalDate.now().minusYears(5);

        Map<String, List<HardwareEntity>> agrupados =
                repository.findAll()
                        .stream()
                        .filter(h -> h.getEstado().equals("ACTIVO"))
                        .filter(h -> h.getFechaCompra().isAfter(limite))
                        .collect(Collectors.groupingBy(
                                HardwareEntity::getCategoria
                        ));

        Map<String, Reporte> resultado = new HashMap<>();

        agrupados.forEach((categoria, lista) -> {

            double total =
                    lista.stream()
                            .mapToDouble(h ->
                                    h.getPrecio().doubleValue())
                            .sum();

            double promedio =
                    lista.stream()
                            .mapToDouble(h ->
                                    h.getPrecio().doubleValue())
                            .average()
                            .orElse(0);

            String equipoMasCaro =
                    lista.stream()
                            .max(Comparator.comparing(
                                    HardwareEntity::getPrecio))
                            .map(HardwareEntity::getModelo)
                            .orElse("N/A");

            resultado.put(
                    categoria,
                    new Reporte(
                            total,
                            promedio,
                            equipoMasCaro
                    )
            );
        });

        return resultado;
    }
}