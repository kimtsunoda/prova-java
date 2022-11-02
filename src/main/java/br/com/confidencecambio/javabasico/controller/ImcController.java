package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/imc")
public class ImcController {
    @Autowired
    private ImcService service;

    @GetMapping
    public ResponseEntity<String> retornaImc(
            @RequestParam(value = "peso", required = true)  double peso,
            @RequestParam(value = "altura", required = true) double altura
    ) {
        var retorno = "IMC: " + service.calculaImc(peso, altura);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
}
