package com.mj.test;

import com.mj.comp.Employee;
import com.mj.comp.Food;

public class SoftwareCompany {

	public static void main(String[] args) {
		System.out.println("main()");
		//College needs student
		//create dependent class object
		Food food = new Food();
		//create target class object
		Employee employee=new Employee(food);
		employee.work();
	}

}
