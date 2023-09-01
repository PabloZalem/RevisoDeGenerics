package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.zalempablo.revisaodestream.domain.Livro;

public class StreamTest002 {
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
		List<String> collect = list.stream()
		.sorted(Comparator.comparing(Livro::getTitulo))//intermediario
		.filter(l -> l.getPreco() <= 4.0)//intermediaria
		.limit(3)//intermediaria
		.map(l -> l.getTitulo())//intermediaria
		.collect(Collectors.toList());	//FINAL
		
		System.out.println(collect);
	}
}
