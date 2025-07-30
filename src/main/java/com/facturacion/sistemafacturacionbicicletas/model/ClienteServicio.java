package com.facturacion.sistemafacturacionbicicletas.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;


import lombok.Data;


import java.time.LocalDate;

@Entity
@Data
public class ClienteServicio {

    @Id //
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombres;

    private String bicicleta;

    private LocalDate fechaServicio;

    private String medida;

    private String color;

    @Column(length = 500)
    private String diagnostico;

    @Column(length = 1000)
    private String descripcion;

}