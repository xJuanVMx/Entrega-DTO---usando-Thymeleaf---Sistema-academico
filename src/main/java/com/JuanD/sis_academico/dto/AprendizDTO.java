package com.JuanD.sis_academico.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AprendizDTO {

    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Correo no válido")
    private String correo;

    @NotBlank(message = "El programa es obligatorio")
    private String programa;

    private String ficha;
}