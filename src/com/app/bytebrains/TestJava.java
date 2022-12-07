package com.app.bytebrains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Test implements Runnable {
	@Override
	public void run() {
		System.out.println("Run Method Before Java 8");
	}
}

public class TestJava {

	public static void main(String[] args) {
		// Before Java 8
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Run Method Before Java 8");
			}
		};
		Thread th = new Thread(r);
		th.start();

		// After Java 8
		Runnable r1 = () -> System.out.println("Run Method After Java 8");
		Thread th1 = new Thread(r1);
		th1.start();

		/*
		 * List<Student> list = new ArrayList<>(); list.add(new Student("xyz"));
		 * list.add(new Student("abc")); list.add(new Student("mno"));
		 */

		// Before Java 8
		/*
		 * Comparator<Student> nameComparator = new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { return
		 * o1.getName().compareTo(o2.getName()); } };
		 * 
		 * Collections.sort(list, nameComparator); System.out.println(list);
		 */
		/*
		 * Comparator<Student> nameComparator1 = (Student s1, Student s2) ->
		 * s1.getName().compareTo(s2.getName());
		 * 
		 * Collections.sort(list, nameComparator1); System.out.println(list);
		 */
		
		
	}
}
