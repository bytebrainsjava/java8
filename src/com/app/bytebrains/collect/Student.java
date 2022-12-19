package com.app.bytebrains.collect;

public class Student {
	
	private String name;
	private int age;
	private String subject; 
	private double mark;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public Student(String name, int age, String subject, double mark) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", subject=" + subject + ", mark=" + mark + "]";
	}
	
	

}
