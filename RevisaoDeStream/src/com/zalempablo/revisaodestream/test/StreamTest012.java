package com.zalempablo.revisaodestream.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zalempablo.revisaodestream.domain.Categoria;
import com.zalempablo.revisaodestream.domain.Livro;
import com.zalempablo.revisaodestream.domain.Promocao;

public class StreamTest012 {
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
		Map<Promocao, List<Livro>> collect = list.stream()
			.collect(Collectors.groupingBy(l -> {
				return l.getPreco() < 6 ? Promocao.ABAIXO_DA_PROMOCAO : Promocao.PRECO_NORMAL;
			}));
		System.out.println(collect);
		
		//Map<Category, Map<Promocao, List<list>>
		Map<Categoria, Map<Promocao, List<Livro>>> collect2 = list.stream()
					.collect(Collectors.groupingBy(l -> l.getCategoria(),
					Collectors.groupingBy(l -> l.getPreco() < 6 ? Promocao.ABAIXO_DA_PROMOCAO : Promocao.PRECO_NORMAL)));
		System.out.println(collect2);
	}
}
