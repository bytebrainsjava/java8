package com.app.bytebrains;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentTestFunctionalInterface {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(111, "Sachin", 90, "Maths"));
		list.add(new Student(222, "Ganesh", 80, "History"));
		list.add(new Student(333, "Shankar", 70, "Computer"));
		list.add(new Student(444, "Ram", 60, "Maths"));
		list.add(new Student(555, "Shyam", 85, "Computer"));
		list.add(new Student(666, "abc", 95, "History"));

		Predicate<Student> compPredicate = (Student st) -> st.getSpecialization().equals(CommonConstant.computer);
		List<Student> compList = new ArrayList<>();

		for (Student s1 : list) {
			if (compPredicate.test(s1)) {
				compList.add(s1);
			}
		}
		System.out.println(compList);

		Consumer<Student> percentageConsumer = (Student st) -> {
			System.out.println("Student Name : " + st.getName());
			System.out.println("Student Percentage : " + st.getPercentage());
		};

		for (Student s1 : list) {
			percentageConsumer.accept(s1);
		}
		Function<Student, String> names = (Student s1) -> s1.getName();
		List<String> nameList = new ArrayList<>();
		for (Student s : list) {
			nameList.add(names.apply(s));
		}
		System.out.println(nameList);
		TestFunctional test = new TestFunctional() {
			@Override
			public int test1(int x, int y) {
				return x * x;
			}
		};
		System.out.println(test.test1(10, 30));

		TestFunctional test2 = (a, b) -> a + b;
		System.out.println(test2.test1(20, 10));

		Supplier<Student> studentSupplier = () -> new Student(888, "XXXXXXXXXX", 90, "Maths");
		list.add(studentSupplier.get());
		System.out.println(list);
	}

}
