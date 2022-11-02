package br.com.confidencecambio.javabasico.dto;

import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class ImcDto {
    @Min(0)
    private double peso;
    @Min(0)
    private double altura;
}
