package com.zalempablo.service;

import java.util.ArrayList;
import java.util.List;

import com.zalempablo.domain.Carro;

public class CarroServico {
	private List<Carro> carroDisponivel = new ArrayList<>(
			List.of(new Carro("BM2"),
					new Carro("MECA"))
			);
			//List.of = Representa o banco de dados
	
	public Carro buscarCarroDisponivel() {
		System.out.println("Buscando carro disponivel...");
		Carro carro = carroDisponivel.remove(0); 
		System.out.println("Alugando o carro: "  + carro);
		System.out.println("Carros disponiceis para alugar" + carroDisponivel);
		return carro;
	}
	
	public void retornarCarroAlugado(Carro carro) {
		System.out.println("Devolvendo o carro: " + carro);
		carroDisponivel.add(carro);
		System.out.println("Carros disponiveis: " + carroDisponivel);
	}
}
