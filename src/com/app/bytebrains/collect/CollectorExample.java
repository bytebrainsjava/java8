package com.app.bytebrains.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 6, 8, 9);

		List<Integer> oddNumbList = list.stream()
				.filter(i -> i % 2 != 0)
				.collect(Collectors.toList());
		System.out.println(oddNumbList);
	}
}
