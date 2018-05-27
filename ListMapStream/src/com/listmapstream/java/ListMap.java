package com.listmapstream.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListMap {
	public static void main(String[] args) {

	List<Student> list  = new ArrayList<>();


	list.add(new Student(7,"sachin","MPS"));
	list.add(new Student(2,"Ganguly","KPS"));
	list.add(new Student(73,"Dravid","HPS"));
	list.add(new Student(44,"Sehwag","DPS"));

	System.out.println(">> Here, Displaying the values of Id and Names as Key Vaule Pair: ");
	Map<Integer,String> result = list.stream().collect(Collectors.toMap(x-> x.getId(), x-> x.getName()));
	System.out.println(result);
	
	System.out.println(">> Now, We are going to display only Names and their Schools as Key and Value: ");
	Map<String,String> result1 = list.stream().collect(Collectors.toMap(x-> x.getName(), x-> x.getSchool()));
	System.out.println(result1);
	
	System.out.println(">> Here, Displaying only Id and their Schools: ");
	Map<Integer ,String> result2 = list.stream().collect(Collectors.toMap(Student::getId, Student:: getSchool));
	System.out.println(result2);
	}
}