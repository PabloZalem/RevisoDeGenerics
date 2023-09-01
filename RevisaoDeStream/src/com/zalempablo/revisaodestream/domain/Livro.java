package com.zalempablo.revisaodestream.domain;

import java.util.Objects;

public class Livro {
	private String titulo;
	private Double preco;
	private Categoria categoria;
	
	
	public Livro(String titulo, Double preco, Categoria categoria) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.categoria = categoria;
	}
	public Livro(String titulo, Double preco) {
		super();
		this.titulo = titulo;
		this.preco = preco;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(titulo, other.titulo);
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", preco=" + preco + ", categoria=" + categoria + "]";
	}
	
	
}
