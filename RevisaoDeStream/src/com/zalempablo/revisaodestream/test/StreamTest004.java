package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//FlatMap
public class StreamTest004 {
	public static void main(String[] args) {
		List<List<String>> list = new ArrayList<>();
		List<String> carros = List.of("BMW", "AUDI", "MECA", "WOLKS", "PORSCHE");
		List<String> modelos = List.of("X1", "A1", "C180", "T-CROSS", "911");
		List<String> compradores = List.of("Pedro", "Marcela", "Michelle", "Pablo");
		
		list.add(carros);
		list.add(modelos);
		list.add(compradores);
		
		//Imprimir os elementos antes do JAVA 8
		for(List<String> coisas : list) {
			for (String s : coisas) {
				System.out.println(s);
			} 
		}
		
		//USANDO O FLATMAP
		list.stream()//flat map ele é mais fundo do que map
							.flatMap(Collection::stream)
							.forEach(System.out::println);
	}
}
