package br.teste.tdd.Teste.TDD;

public class BuscaDadoArray {
	
	public boolean BuscaArray(String array[], String nome) {
		
		for(String n : array) {
			if (n == nome) {
				return true;
			}
		}
		
		return false;
	}
}
