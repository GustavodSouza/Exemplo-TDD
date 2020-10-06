package br.teste.tdd.Teste.TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteBuscaDadosArray {
	
	private String nomes[] = {"Gustavo", "Joao", "Pedro"};
	
	@Test
	public void sucesso() {
		assertEquals(true, new BuscaDadoArray().BuscaArray(nomes, "Gustavo"));
	}
	
	@Test
	public void erro() {
		assertEquals(false, new BuscaDadoArray().BuscaArray(nomes, "Alam"));
	}
}
