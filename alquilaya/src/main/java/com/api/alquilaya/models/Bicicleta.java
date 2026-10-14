package com.api.alquilaya.models;

// 1. Nueva Subclase: Hereda de VehiculoModel
public class Bicicleta extends VehiculoModel {
    
    private boolean electrica;

    public Bicicleta(boolean electrica) {
        this.electrica = electrica;
    }

    // Calcula el precio aplicando polimorfismo/lógica específica
    public double calcularPrecioBicicleta(int dias) {
        // Obtenemos la tarifa base usando el getter de la clase padre
        double precioBase = this.getTarifaDiaria().doubleValue() * dias;
        
        if (this.electrica) {
            return precioBase + (2 * dias); // +2€ por día si es eléctrica
        }
        return precioBase;
    }

    public boolean isElectrica() { return electrica; }
    public void setElectrica(boolean electrica) { this.electrica = electrica; }
}