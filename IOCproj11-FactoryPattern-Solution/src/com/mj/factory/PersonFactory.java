package com.mj.factory;

import com.mj.comp.Employee;
import com.mj.comp.Food;
import com.mj.comp.Person;
import com.mj.comp.Student;

public class PersonFactory {
	public static Person getPerson(String type) {
		//create dependent class object
		Food food=new Food();
		Person per=null;
		if (type.equalsIgnoreCase("Emp")) {
			per= new Employee(food);
		}
		else if (type.equalsIgnoreCase("Stud")) {
			per=new Student(food);
		}
		else
			throw new IllegalArgumentException("invalid person type");
		return per;

	}
}
