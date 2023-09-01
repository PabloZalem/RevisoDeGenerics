package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.zalempablo.revisaodestream.domain.Livro;

public class StreamTest003 {
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
		list.stream()//intermedaria
			.forEach(l -> System.out.println(l));//terminal
		
		Stream<Livro> stream = list.stream();//terminal
		System.out.println();
		
		long count = list.stream()//intermediario
				.filter(l -> l.getPreco() <= 4)//intermediario
				.count();//terminal
		System.out.println(count);
		System.out.println();
		
		long count2 = list.stream()//intermediario e precisamos abrir para nao dar erro
				.distinct()//intermediario
				.filter(l -> l.getPreco() <= 4)//intermediario
				.count();//intermediario
		System.out.println(count2);
		System.out.println();
	}
}
