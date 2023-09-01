package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.zalempablo.revisaodestream.domain.Livro;

//1. OrdernarOsLivrosPorTitulo
//2. Traga os primeiros 3 livros com preco de menor de R$4,00
public class StreamTest001 {
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
			//Ordenando por titulo
			list.sort(Comparator.comparing(Livro::getTitulo));
			System.out.println(list);
			
			List<String> titulos = new ArrayList<>();
			
			for(Livro livros : list) {
				if(livros.getPreco() <= 4.0) {
					titulos.add(livros.getTitulo());
				}
				if (titulos.size() >= 3) {
					break;
				}
			}
			System.out.println(titulos);
		}
}

