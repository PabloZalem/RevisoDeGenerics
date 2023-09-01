package com.zalempablo.revisaolambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//Function
public class LambdasTest002 {
	public static void main(String[] args) {
		List<String> list = List.of("Pablo", "Pedro", "Pietro");
		List<Integer> integers =  map(list, (String s) -> s.length());
		List<String> map = map(list, s -> s.toUpperCase());
		
		System.out.println(integers);
		System.out.println(map);
	}
	
	//T manda e R o tipo de retorno que terá
	private static <T,R> List<R> map(List<T> list, Function<T,R> function){
		List<R> resultado = new ArrayList<>();
		
		for(T t : list) {
			R r = function.apply(t);
			resultado.add(r);
		}
		return resultado;
	}
}
