package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.zalempablo.revisaodestream.domain.Livro;

public class StreamTest010 {
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
		System.out.println(list.size());
		System.out.println(list.stream()
				.count());
		
		System.out.println(list
				.stream()
				.collect(Collectors.counting()));
		
		list.stream()
			.max(Comparator.comparing(t -> t.getPreco()))
			.ifPresent(t -> System.out.println(t));
		
		list.stream()
					.collect(Collectors.maxBy(Comparator.comparing(t -> t.getPreco())))
					.ifPresent(t -> System.out.println(t));
		
		list.stream()
				.collect(Collectors.maxBy(Comparator.comparing(t -> t.getPreco())))
				.ifPresent(t -> System.out.println(t));
		
		System.out.println(list.stream()
				.mapToDouble(l -> l.getPreco())
				.sum());
		
		System.out.println(list.stream()
				.collect(Collectors.summarizingDouble(l -> l.getPreco())));
		
		list.stream()
				.mapToDouble(l -> l.getPreco())
				.average()
				.ifPresent(l -> System.out.println(l));
		
		System.out.println(list.stream()
				.mapToDouble(l -> l.getPreco())
				.average());
		
		System.out.println(list.stream()
				.collect(Collectors.averagingDouble(l -> l.getPreco())));
		
		DoubleSummaryStatistics collect = list.stream()
			.collect(Collectors.summarizingDouble(l -> l.getPreco()));
		System.out.println(collect);
		
		String string = list.stream()
			.map(l -> l.getTitulo())
			.collect(Collectors.joining(", "));
		System.out.println(string);
	}
}
