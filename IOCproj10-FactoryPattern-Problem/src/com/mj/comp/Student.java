package com.mj.comp;

public class Student extends Person {
	private String rollNo;
	private String course;
	private Food food;
	public Student(Food food) {
		System.out.println("Student 1-param constructor");
		this.food=food;
	}
	@Override
	public void work() {
		System.out.println("Student is studying B.tech "+food);

	}

}
