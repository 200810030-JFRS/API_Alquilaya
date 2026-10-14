package com.api.alquilaya.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehiculos")
public class VehiculoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehiculo;

    @Column(nullable = false, length = 50)
    private String marca;

    @Column(nullable = false, length = 50)
    private String modelo;

    @Column(name = "anio", nullable = false)
    private int anio;

    @Column(nullable = false, unique = true, length = 20)
    private String matricula;

    @Column(name = "tarifa_diaria", nullable = false)
    private BigDecimal tarifaDiaria;

    @Column(nullable = false, length = 30)
    private String estado; // Disponible, Alquilado, Mantenimiento

    // Constructor vacío requerido por JPA
    public VehiculoModel() {
        this.estado = "Disponible";
    }

    // Constructor con parámetros
    public VehiculoModel(String marca, String modelo, int anio, String matricula, BigDecimal tarifaDiaria, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.matricula = matricula;
        this.tarifaDiaria = tarifaDiaria;
        this.estado = estado != null ? estado : "Disponible";
    }

    // Getters y Setters
    public Long getIdVehiculo() { return idVehiculo; }
    public void setIdVehiculo(Long idVehiculo) { this.idVehiculo = idVehiculo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public BigDecimal getTarifaDiaria() { return tarifaDiaria; }
    public void setTarifaDiaria(BigDecimal tarifaDiaria) { this.tarifaDiaria = tarifaDiaria; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}