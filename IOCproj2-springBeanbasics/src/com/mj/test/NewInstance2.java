package com.mj.test;

import java.lang.reflect.Constructor;

public class NewInstance2 {
	//run the project with configuration providing argument 'com.mj.bean.Test'
	public static void main(String[] args) throws Exception {
		Class c=Class.forName(args[0]);
		Constructor cons[]=c.getDeclaredConstructors();
		for (Constructor constructor : cons) {
			System.out.println(constructor);
		}
		Object obj1=cons[1].newInstance();
		System.out.println("Obj1 Data"+obj1);
		Object obj2=cons[0].newInstance(2,5);
		System.out.println("Obj2 Data"+obj2);
	}

}
