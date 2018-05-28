package com.stream.integers;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = {"a","b","c","d","e"};
		String[] array1 = {"z","y","x","w","v","u"};
		
	System.out.println("One way of converting Arrays to stream is:");
		Stream<String> alpha = Stream.of(array);
		alpha.forEach(System.out::println);
		
		System.out.println("The another way of converting Arrays to Stream as follows:");
		Stream<String> alpha1 = Arrays.stream(array1);
		alpha1.forEach(x-> System.out.println(x));
	}

}
