package br.com.confidencecambio.javabasico.service;

import org.springframework.stereotype.Service;

@Service
public class ImcService {

    public double calculaImc(double peso, double altura) {

        return peso / Math.pow(altura, 2);
    }
}
