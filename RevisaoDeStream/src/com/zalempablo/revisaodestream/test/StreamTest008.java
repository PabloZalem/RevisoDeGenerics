package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

import com.zalempablo.revisaodestream.domain.Livro;

public class StreamTest008 {
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
		list.stream()
			.filter(l -> l.getPreco() > 3)
			.map(l -> l.getPreco())
			.reduce((t, u) -> Double.sum(t, u))
			.ifPresent(t -> System.out.println(t));
		
		double sum = list.stream()
			.mapToDouble(Livro::getPreco)
			.filter(preco -> preco > 3)
			.sum();
			
	}
}
