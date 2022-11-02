package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.dto.NomeDto;
import br.com.confidencecambio.javabasico.model.Usuario;
import org.springframework.stereotype.Service;


@Service
public class NomeService {

    public NomeDto obterNomes(Usuario usuario) {

        String nome = usuario.getNome();

        if (nome == null) {
            return null;
        }

        if (nome.isBlank() || nome.startsWith(" ") || nome.endsWith(" ")) {
            return null;
        }

        var nomes = new NomeDto();

        nomes.setPrimeiroNome(obterPrimeiroNome(nome));
        nomes.setUltimoNome(obterUltimoNome(nome));
        nomes.setNomeMaiusculo(nome.toUpperCase());
        nomes.setNomeAbreviado(obterNomeAbreviado(nome));

        return nomes;

    }

    private String obterPrimeiroNome(String request) {
        return request.split(" ")[0];
    }

    private String obterUltimoNome(String request) {
        var i = request.split(" ").length;
        return request.split(" ")[(i - 1)];
    }

    private String obterNomeAbreviado(String request) {
        String response = "";
        String[] nome = request.split(" ");
        nome[1] = nome[1].substring(0, 1).concat(".");
        for (String string : nome) {
            response = response.concat(string).concat(" ");
        }
        return response.substring(0, response.length() - 1);
    }

}
