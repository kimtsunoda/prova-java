package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.dto.ImcDto;
import org.springframework.stereotype.Service;


@Service
public class ImcService {

    public String calculaImc(ImcDto request) {

        double calculo;
        double peso = request.getPeso();
        double altura = request.getAltura() == 0? 1:Math.pow(request.getAltura(), 2);

        if (request.getPeso() == 0) {
            calculo = 0D;
        } else {
            calculo = peso / altura;
        }

        return "IMC: " + calculo;
    }

}
