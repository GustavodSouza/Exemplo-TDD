package br.teste.tdd.Teste.TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculadora {
	
	@Test
	public void somar() {
		assertEquals(5, new Calculadora().somar(3, 2));
	}
	
	@Test
	public void subtrair() {
		assertEquals(10, new Calculadora().subtrair(15, 5));
	}
	
	@Test
	public void dividir() {
		assertEquals(15, new Calculadora().dividir(30, 2));
	}
	
	@Test
	public void multiplicar() {
		assertEquals(10, new Calculadora().multiplicar(2, 5));
	}
	
	@Test
	public void resto() {
		assertEquals(0, new Calculadora().resto(4, 2));
	}
}
