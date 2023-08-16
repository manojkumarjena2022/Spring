package com.mj.test;

import com.mj.comp.Food;
import com.mj.comp.Student;

public class College {

	public static void main(String[] args) {
		System.out.println("main()");
		Food food=new Food();
		Student student=new Student(food);
		student.work();
	}

}
