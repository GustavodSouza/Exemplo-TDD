package br.teste.tdd.Teste.TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestVerificarIdade {
	
	//Função que fara o teste de sucesso de idade
	@Test
	public void sucesso () {
		//Aqui o esperado é que a função retorne "Maior"
		assertEquals(true, new VerificarIdade().maioridade(20));
	}
	
	//Função que fara o teste de erro de idade
	@Test
	public void erro () {
		
		//Aqui o esperado é que a função retorne "Menor"
		assertEquals(false, new VerificarIdade().maioridade(15));
	}
}
