package com.mj.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxac=new ClassPathXmlApplicationContext("com/mj/cfgs/applicationContext.xml");
	}
}
//ctrl+F11 to run as java application