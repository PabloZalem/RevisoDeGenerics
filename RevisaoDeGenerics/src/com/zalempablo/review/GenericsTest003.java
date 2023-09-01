package com.zalempablo.review;

import java.util.ArrayList;
import java.util.List;

import com.zalempablo.domain.Barco;
import com.zalempablo.domain.Carro;
import com.zalempablo.service.GenericService;

public class GenericsTest003 {
	public static void main(String[] args) {
		List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BM2"), new Carro("MECA")));
		List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Bote"),new Barco("Iate")));
		
		GenericService<Carro> genericServiceCarro = new GenericService<>(carrosDisponiveis);
		GenericService<Barco> genericServiceBarco = new GenericService<>(barcosDisponiveis);
		
		Carro carro = genericServiceCarro.buscandoObjetoDisponivel();
		System.out.println("Utilizando o carro por um mes...");
		genericServiceCarro.retornarBarcoAlugado(carro);
		
		Barco barco = genericServiceBarco.buscandoObjetoDisponivel();
		System.out.println("Utilizando o barco por um mes...");
		genericServiceBarco.retornarBarcoAlugado(barco);
	}
}
