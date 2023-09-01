package com.zalempablo.service;

import java.util.List;

//T do tipo Title ou E de Element
public class GenericService<T> {
	private List<T> objetosDisponiveis;

	public GenericService(List<T> objetosDisponiveis) {
		this.objetosDisponiveis = objetosDisponiveis;
	}
			
	public T buscandoObjetoDisponivel() {
		System.out.println("Buscando Objeto disponivel...");
		T t = objetosDisponiveis.remove(0); 
		System.out.println("Obtendo objeto: "  + t);
		System.out.println("Objetos disponiveis para alugar" + objetosDisponiveis);
		return t;
	}
	
	public void retornarBarcoAlugado(T t) {
		System.out.println("Devolvendo o Objeto: " + t);
		objetosDisponiveis.add(t);
		System.out.println("Objetos disponiveis: " + t);
	}
}
