package com.stream.java;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> language = Stream.of("Java","Python",".Net");
		
		List<String> result = language.collect(Collectors.toList());
		
		System.out.println("Here, converting streams in to list");
		
		result.forEach(System.out::println);
	}

}
