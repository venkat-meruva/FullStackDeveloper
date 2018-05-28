package com.nullstream.java;

import java.util.*;

import java.util.stream.*;

public class StreamListIntegers {

	public static void main(String[] args) {
		

		Stream<Integer> number = Stream.of(1,2,3,4,5);
		
		System.out.println("Filtering no 3");
		System.out.println("The output as follows:");
		
		List<Integer> result = number.filter(x-> x!=3).collect(Collectors.toList());
		
		result.forEach(x-> System.out.println(x));
		
	}

}
