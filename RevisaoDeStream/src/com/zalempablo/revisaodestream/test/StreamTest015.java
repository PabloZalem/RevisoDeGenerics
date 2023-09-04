package com.zalempablo.revisaodestream.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest015 {	
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		long num = 10_000_000;
		sumFor(num);
		sumStreamIterate(num);
		sumParallelStreamIterate(num);
		sumLongStreamIterate(num);
	}
	
	private static void sumFor(long num) {
		System.out.println("Soma por");
		long resultado = 0;
		long init = System.currentTimeMillis();
		for (int i = 1; i <= num; i++) {
			resultado += i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(resultado + "" + (end - init) + "ms");
	}
	
	private static void sumStreamIterate(long num) {
		System.out.println("Soma StreamIterate");
		long init = System.currentTimeMillis();
		long resultado = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);	
		long end = System.currentTimeMillis();
		System.out.println(resultado + "" + (end - init) + "ms");
	}
	
	private static void sumParallelStreamIterate(long num) {
		System.out.println("Soma ParallelStreamIterate");
		long init = System.currentTimeMillis();
		long resultado = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);	
		long end = System.currentTimeMillis();
		System.out.println(resultado + "" + (end - init) + "ms");
	}
	
	private static void sumLongStreamIterate(long num) {
		System.out.println("Soma LongStreamIterate");
		long init = System.currentTimeMillis();
		long resultado = LongStream.range(1L, num).reduce(0L, Long::sum);
		long end = System.currentTimeMillis();
		System.out.println(resultado + "" + (end - init) + "ms");
	}
}
