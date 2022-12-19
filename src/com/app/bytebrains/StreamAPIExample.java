package com.app.bytebrains;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {

		/*
		 * // Create a Stream Stream<Student> stream = Stream.empty();
		 * System.out.println(stream.count());
		 * 
		 * // Create a Stream of Single Record. Stream<Student> stream1 = Stream.of(new
		 * Student(10)); System.out.println(stream1.count());
		 * 
		 * Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6);
		 * System.out.println(stream3.count());
		 */
		
		
		List<String> list =  new ArrayList<>();
		
		list.add("ABCDE");
		list.add("PQR");
		list.add("XYZW");
		list.add("PQRRRRRRR");
		list.add("ABC");
		list.add("MNO");
		
		System.out.println("By using Java 8");
		// list.stream().map(String::length).forEach(System.out::print);
		
		// list.stream().sorted().forEach(System.out::println);
		
		list.stream().sorted((String s1, String s2)-> s1.length()-s2.length())
		.forEach(System.out::println);
		
		//list.stream().distinct().forEach(System.out::println);
	
		
	// select first n element
		//list.stream().skip(3).forEach(System.out::println);
	
		
		
	}
}
