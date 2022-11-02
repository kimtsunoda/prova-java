package br.com.confidencecambio.javabasico.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class Usuario {
    @NotBlank
    private String name;
}
