package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.zalempablo.revisaodestream.domain.Categoria;
import com.zalempablo.revisaodestream.domain.Livro;

public class StreamTest013 {
	private static List<Livro> list = new ArrayList<>(List.of(
			new Livro("Harry Potter 1 ", 4.50, Categoria.FANTASIA),
			new Livro("Harry Potter 2 ", 4.00, Categoria.ROMANCE),
			new Livro("Harry Potter 3 ", 5.30, Categoria.FANTASIA),
			new Livro("Harry Potter 4 ", 3.30, Categoria.ROMANCE),
			new Livro("Harry Potter 5 ", 9.50, Categoria.ROMANCE),
			new Livro("Harry Potter 6 ", 8.50, Categoria.ROMANCE),
			new Livro("Harry Potter 7 ", 2.50, Categoria.FANTASIA)
			));
	
	public static void main(String[] args) {
		Map<Categoria, Long> collect = list.stream()
			.collect(Collectors.groupingBy(l -> l.getCategoria(),
						Collectors.counting()));
		System.out.println(collect);
		
		
		Map<Categoria, Optional<Livro>> collect2 = list.stream().
			collect(Collectors.groupingBy(l -> l.getCategoria(), 
					Collectors.maxBy(Comparator.comparing(l -> l.getPreco()))));
		System.out.println(collect2);
		
		
		Map<Categoria, Livro> collect3 = list.stream().collect(Collectors.groupingBy(Livro::getCategoria,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Livro::getPreco)), 
								Optional::get)));
		System.out.println(collect3);
	}
}
