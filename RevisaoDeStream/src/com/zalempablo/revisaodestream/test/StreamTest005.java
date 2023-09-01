package com.zalempablo.revisaodestream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest005 {
	public static void main(String[] args) {
		List<String> list = List.of("Sim", "Nao", "Talvez", "Quem");
		String[] letters = list.get(0).split("");
		System.out.println(Arrays.toString(letters));
		
		//Ter uma lista e cada um deles ter apenas uma letra
		List<String> collect = list.stream()
			.map(l -> l.split("")) //Um Stream com array de String
			.flatMap(t -> Arrays.stream(t)) //Pagar o array um stream de String
			.collect(Collectors.toList());
		System.out.println(collect);
	}
}
