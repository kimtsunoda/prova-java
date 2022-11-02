package br.com.confidencecambio.javabasico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NomeDto {
    private String primeiroNome;
    private String ultimoNome;
    private String nomeMaiusculo;
    private String nomeAbreviado;
}
