package br.teste.tdd.Teste.TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestArrayInformacoes {

	private String arrayNotNull[] = {"Gustavo", "Joao", "Pedro"};
	private String arrayNull[] = {};
	
	@Test
	public void sucesso() {
		assertEquals(true, new ArrayInformacoes().verificarArray(arrayNotNull));
	}
	
	@Test
	public void erro() {
		assertEquals(false, new ArrayInformacoes().verificarArray(arrayNull));
	}
}
