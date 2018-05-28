package com.nullstream.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringNull {

	static String[] legends = { "sachin", "Sehwag", "Ganguly", null, "Virat", null };

	public static void main(String[] args) {

		System.out.println(">> Here printing including null values");
		Stream<String> names = Stream.of(legends);
		List<String> names1 = names.collect(Collectors.toList());
		names1.forEach(System.out::println);
		
		System.out.println(">> Here Printing with out null values");

		Stream<String> values = Stream.of(legends);
		List<String> names2 = values.filter(x->x!=null).collect(Collectors.toList());
		names2.forEach(x-> System.out.println(x));
		
 	}

}
