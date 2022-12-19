package com.app.bytebrains.collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCollectors {
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Naveen", 11, "Economics", 78.9));
		studentList.add(new Student("Ajay", 12, "Computer Science", 91.2));
		studentList.add(new Student("Tanuraj", 13, "History", 83.7));
		studentList.add(new Student("Priti", 14, "Literature", 71.5));
		studentList.add(new Student("Harshal", 15, "Economics", 77.5));
		studentList.add(new Student("Omkar", 16, "Mathematics", 89.4));
		studentList.add(new Student("Shubham", 17, "Computer Science", 84.6));
		studentList.add(new Student("Lavina", 18, "History", 73.5));
		studentList.add(new Student("Rutik", 19, "Mathematics", 92.8));
		studentList.add(new Student("Danish", 20, "History", 71.9));

		
	
		
		List<Student> top3Student = studentList.stream().sorted(Comparator.comparingDouble(Student::getMark).reversed())
				.limit(3).collect(Collectors.toList());

		//	System.out.println(top3Student);

		// Collect only Subject

		Set<String> set = studentList.stream()
				.map(Student::getName)
				.collect(Collectors.toSet());
		// System.out.println(set);
		
		// 
		 Map<String, Double> map = studentList.stream()
				 .collect(Collectors.toMap(Student::getName, Student::getMark));
		// System.out.println(map);
		
		 Long count = studentList.stream().collect(Collectors.counting());
		// System.out.println(count);
		 
		 Double collect = studentList.stream().map(Student::getMark)
		 .collect(Collectors.minBy(Comparator.naturalOrder())).get();
		// System.out.println(collect);
		 
		 // Group --- Map<String, List<Student>> ;  
		
		 Map<String, List<Student>> map1 = 
				studentList.stream()
				.collect(Collectors.groupingBy(Student::getSubject));
		 System.out.println(map1);
		 
		
	}

}
