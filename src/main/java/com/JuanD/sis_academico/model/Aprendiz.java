package com.JuanD.sis_academico.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "aprendices")
public class Aprendiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Correo no válido")
    @Column(unique = true)
    private String correo;

    @NotBlank(message = "El programa es obligatorio")
    private String programa;

    private String ficha;

    public Aprendiz() {}

    public Aprendiz(String nombre, String correo, String programa, String ficha) {
        this.nombre = nombre;
        this.correo = correo;
        this.programa = programa;
        this.ficha = ficha;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getPrograma() { return programa; }
    public void setPrograma(String programa) { this.programa = programa; }

    public String getFicha() { return ficha; }
    public void setFicha(String ficha) { this.ficha = ficha; }
}
