package com.espe.Autonomo_1P.domain.service.model;

public class Reporte {

    private double valorTotal;
    private double promedio;
    private String equipoMasCaro;

    public Reporte() {
    }

    public Reporte(double valorTotal, double promedio, String equipoMasCaro) {
        this.valorTotal = valorTotal;
        this.promedio = promedio;
        this.equipoMasCaro = equipoMasCaro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEquipoMasCaro() {
        return equipoMasCaro;
    }

    public void setEquipoMasCaro(String equipoMasCaro) {
        this.equipoMasCaro = equipoMasCaro;
    }
}