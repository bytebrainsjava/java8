package com.app.bytebrains;

class SuperClass {
	public SuperClass(int i) {
		System.out.println("Super Class Constructor");
	}
}
class SubClass extends SuperClass {
	public SubClass() {
		this(10); // Calling same class constructor
	}

	public SubClass(int i) {
		super(i); // Calling super class constructor
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
	}
}
