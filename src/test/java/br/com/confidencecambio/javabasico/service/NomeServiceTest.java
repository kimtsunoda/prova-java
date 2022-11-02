package br.com.confidencecambio.javabasico.service;


import br.com.confidencecambio.javabasico.dto.NomeDto;
import br.com.confidencecambio.javabasico.model.Cliente;
import br.com.confidencecambio.javabasico.model.Gerente;
import br.com.confidencecambio.javabasico.model.Robo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NomeServiceTest {

    private NomeService service;

    @Before
    public void init() {
        service = new NomeService();
    }


    @Test
    public void quandoObtemNomesClienteSucesso() {
        Cliente cliente = new Cliente();
        cliente.setName("João Soares Silva");
        NomeDto clienteResponse = service.obterNomes(cliente);
        assertEquals(nomesSucesso().getClass(), clienteResponse.getClass());
    }

    @Test
    public void quandoObtemNomesGerenteSucesso() {
        Gerente gerente = new Gerente();
        gerente.setName("João Soares Silva");
        NomeDto gerenteResponse = service.obterNomes(gerente);
        assertEquals(nomesSucesso().getClass(), gerenteResponse.getClass());
    }

    @Test
    public void quandoObtemNomesRoboSucesso() {
        Robo robo = new Robo();
        robo.setName("João Soares Silva");
        NomeDto roboResponse = service.obterNomes(robo);
        assertEquals(nomesSucesso().getClass(), roboResponse.getClass());
    }

    private NomeDto nomesSucesso() {

        NomeDto response = new NomeDto();
        response.setPrimeiroNome("João");
        response.setUltimoNome("Silva");
        response.setNomeAbreviado("João S. Silva");
        response.setNomeMaiusculo("JOÃO SOARES SILVA");

        return response;
    }

}