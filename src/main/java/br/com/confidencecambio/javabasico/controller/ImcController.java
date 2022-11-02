package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.dto.ImcDto;
import br.com.confidencecambio.javabasico.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/imc")
public class ImcController {
    @Autowired
    private ImcService service;

    @PostMapping
    public ResponseEntity<String> retornaImc(
            @RequestBody @Valid ImcDto request
    ) {
        return new ResponseEntity<>(service.calculaImc(request), HttpStatus.OK);
    }

}
