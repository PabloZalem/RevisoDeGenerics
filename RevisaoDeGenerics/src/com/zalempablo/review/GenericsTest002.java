package com.zalempablo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest002 {
	public static void main(String[] args) {
		List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		List<Gato> gatos = List.of(new Gato(), new Gato());
		 
		printConsult(cachorros);
		printConsult(gatos);
		
		List<Animal> animals = new ArrayList<>();
		printConsult(animals);
		printConsultaAnimal(animals);
		//So aceitam super classes e não subclasses
		printConsultaCachorro(cachorros);
		
		printConsultaCachorro(animals);
	}
	
	//Type Erasure ?
	//Passamos qualquer tipo de animal
	private static void printConsult(List<? extends Animal> animals) {
		for(Animal animal : animals) {
			animal.consulta();
		}
	}
	
	//Aqui podemos adicionar qualquer uma das subclasses
	private static void printConsultaAnimal(List<? super Animal> animals) {
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();
		
		animals.add(new Cachorro());
		animals.add(new Gato());
	}
	
	//Aqui pode vim de Cachorro, Animais ou Object
	private static void printConsultaCachorro(List<? super Cachorro> animals) {
		//A unica forma de imprimir a classe cachorro
		for (Object o : animals) {
			if (o instanceof Cachorro) {
				System.out.println(o);
			}
			if (o instanceof Animal) {
				System.out.println(o);
			}
			if (o instanceof Object) {
				System.out.println(o);
			}
		}
	}
	
	//Aqui pode vim de Gato, Animais ou Object
	private static void printConsultaGato(List<? super Gato> animals) {
		//A unica forma de imprimir a classe gato
		for (Object o : animals) {
			if (o instanceof Gato) {
				System.out.println(o);
			}
			if (o instanceof Animal) {
				System.out.println(o);
			}
			if (o instanceof Object) {
				System.out.println(o);
			}
		}
	}
}


abstract class Animal{
	public abstract void consulta();
}

class Cachorro extends Animal{
	@Override
	public void consulta() {
		System.out.println("Cachorro na CONSULTA");
	}	
}

class Gato extends Animal{
	@Override
	public void consulta() {
		System.out.println("Gato na CONSULTA");
	}	
}