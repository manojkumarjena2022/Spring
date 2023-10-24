package com.mj.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.beans.Cricketer;

public class LookupMethodInjectionTest {

	public static void main(String[] args) {
		//create IOC
		ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("com/mj/cfgs/applicationContext.xml");
		System.out.println("LookupMethodInjectionTest.main()");
		//get bean class object
		Cricketer cricketer=cpxac.getBean("cricketer",Cricketer.class);
		System.out.println(cricketer.getClass()+".........."+cricketer.getClass().getSuperclass()+"......"+Arrays.toString(cricketer.getClass().getDeclaredMethods()));
		//use bean object
		cricketer.bowling();
		cricketer.fielding();
		cricketer.wicketKeeping();
		cricketer.batting();
		//close IOC
		cpxac.close();

	}

}
