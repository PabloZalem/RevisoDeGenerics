package com.zalempablo.service;

import java.util.ArrayList;
import java.util.List;

import com.zalempablo.domain.Barco;

public class BarcoServico {
	private List<Barco> BarcoDisponivel = new ArrayList<>(
			List.of(new Barco("Bote"),
					new Barco("Iate"))
			);
			//List.of = Representa o banco de dados
	
	public Barco buscarBarcoDisponivel() {
		System.out.println("Buscando Barco disponivel...");
		Barco Barco = BarcoDisponivel.remove(0); 
		System.out.println("Alugando o Barco: "  + Barco);
		System.out.println("Barcos disponiceis para alugar" + BarcoDisponivel);
		return Barco;
	}
	
	public void retornarBarcoAlugado(Barco Barco) {
		System.out.println("Devolvendo o Barco: " + Barco);
		BarcoDisponivel.add(Barco);
		System.out.println("Barcos disponiveis: " + BarcoDisponivel);
	}
}
