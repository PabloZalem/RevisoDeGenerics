package com.zalempablo.service;

import java.util.List;

import com.zalempablo.domain.Barco;
import com.zalempablo.domain.Carro;

public class GenericsMetodos {
	public static void main(String[] args) {
		criarArrayComUmObjeto(new Barco("Canoa Marota"));
		criarUmaLista(new Carro("Meca"));
	}

//Metodo generico
	private static <T> void criarArrayComUmObjeto(T t) {
		List<T> list = List.of(t);
		System.out.println(list);
	}
	
//Metodo generico com Lista generico
	private static <T> List<T> criarUmaLista(T t){
		List<T> list = List.of(t);
		System.out.println(list);
		return list;
	}
	
//Metodo que extende algo	
	private static <T extends Comparable<T>> List<T> criarUmaLista(T t){
		return List.of(t);
	}
}
