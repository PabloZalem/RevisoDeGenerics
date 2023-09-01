package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.zalempablo.revisaodestream.domain.Livro;

public class StreamTest006 {
	private static List<Livro> list = new ArrayList<>(List.of(
			new Livro("Harry Potter 1 ", 4.50),
			new Livro("Harry Potter 2 ", 4.00),
			new Livro("Harry Potter 3 ", 5.30),
			new Livro("Harry Potter 4 ", 3.30),
			new Livro("Harry Potter 5 ", 9.50),
			new Livro("Harry Potter 6 ", 8.50),
			new Livro("Harry Potter 7 ", 2.50)
			));
	
	public static void main(String[] args) {
		boolean anyMatch = list.stream()
			.anyMatch(l -> l.getPreco() > 9.0);//Busca e retornar o boolean
		System.out.println(anyMatch);
		
		boolean allMatch = list.stream()
			.allMatch(l -> l.getPreco() > 0.0);
		System.out.println(allMatch);
			
		boolean noneMatch = list.stream()
			.noneMatch(l -> l.getPreco() < 0.0);
		System.out.println(noneMatch);
		
		list.stream()
			.filter(l -> l.getPreco() > 3.0)
			.findAny()
			.ifPresent(t -> System.out.println(t));
		
		list.stream()
			.filter(l -> l.getPreco() > 3)
			.findFirst()
			.ifPresent(t -> System.out.println(t));
		
		list.stream()
		.filter(l -> l.getPreco() > 3)
		.sorted(Comparator.comparing(Livro::getPreco)
		.reversed())
		.findFirst()
		.ifPresent(t -> System.out.println(t));
		
	}
}
