package com.zalempablo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest001 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Pablo");
		list.add("Michelle");
		
		
		for(Object o : list) {
			if (o instanceof String) {
				System.out.println(o);
			}
		}
		add(list, "Pedro");
	}
	
	
	private static void add(List<String> list, String txt) {
		list.add(txt);
	}
}
