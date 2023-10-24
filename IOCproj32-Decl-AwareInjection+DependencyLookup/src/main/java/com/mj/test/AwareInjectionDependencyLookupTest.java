package com.mj.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.beans.Cricketer;

public class AwareInjectionDependencyLookupTest {

	public static void main(String[] args) {
		//create IOC
		ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("com/mj/cfgs/applicationContext.xml");
		System.out.println("AwareInjectionDependencyLookupTest.main()");
		//get bean class object
		Cricketer cricketer=cpxac.getBean("cricketer",Cricketer.class);
		//use bean object
		cricketer.bowling();
		cricketer.fielding();
		cricketer.wicketKeeping();
		cricketer.batting();
		//close IOC
		cpxac.close();

	}

}
