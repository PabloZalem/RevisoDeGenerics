package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.zalempablo.revisaodestream.domain.Livro;

public class StreamTest007 {
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
		List<Integer> of = List.of(1,2,3,4,5,6,7);
		
		of.stream()
			.reduce((x,y) -> x + y)
			.ifPresent(t -> System.out.println(t));
		
		System.out.println(of.stream()
			.reduce(0,(x,y) -> x + y));
			
		of.stream()
			.reduce(Integer::sum)
			.ifPresent(System.out::println);
		
		System.out.println(of.stream()
			.reduce(0, Integer::sum));
	
		of.stream() 
		.reduce((x,y) -> x * y)
		.ifPresent(System.out::println);
		
		System.out.println(of.stream()
				.reduce(1, (x, y) -> x * y));
			
		of.stream() 
		.reduce((x,y) -> x > y ? x : y)
		.ifPresent(System.out::println);
		
		System.out.println(of.stream()
				.reduce(1, (x, y) -> x * y));
		
		of.stream() 
			.reduce((x,y) -> x > y ? x : y)
			.ifPresent(System.out::println);
		
		of.stream()
			.reduce(Integer::max)
			.ifPresent(System.out::println);
		
		of.stream()
			.reduce((x,y) -> x > y ? x : y)
			.ifPresent(System.out::println);
		
		System.out.println(of.stream()
								.reduce(10, Integer::max));
	}
}
