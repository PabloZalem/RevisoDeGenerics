package com.zalempablo.revisaolambdas.test;

import java.util.List;
import java.util.function.Consumer;

//Consumer
public class LambdasTest001 {
	public static void main(String[] args) {
		//(parametro) -> <expressao>
		//(Carro carro) -> carro.getCor().equals("verde");
		
		List<Integer> integer =  List.of(1,2,3,4,5,6,7,8);
		List<String> strings = List.of("Pablo", "Pedro", "Pietro");
		forEach(strings, (String s) -> System.out.println(s));
		forEach(integer, (Integer i) -> System.out.println(i));
	}
	
	private static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for(T t : list) {
			consumer.accept(t);
		}
	}
}
