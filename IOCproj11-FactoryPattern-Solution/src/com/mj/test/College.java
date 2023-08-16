package com.mj.test;
import com.mj.comp.Person;
import com.mj.factory.PersonFactory;

public class College {

	public static void main(String[] args) {
		System.out.println("main()");
		Person person=PersonFactory.getPerson("Stud");
		person.work();
	}

}
