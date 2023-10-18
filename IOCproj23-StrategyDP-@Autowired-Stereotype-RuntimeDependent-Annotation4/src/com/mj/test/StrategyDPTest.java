package com.mj.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.comp.Flipkart;

public class StrategyDPTest {
	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext beanFactory=new ClassPathXmlApplicationContext("com/mj/cfgs/applicationContext.xml");
		//get target class object
		Flipkart flipkartObj=beanFactory.getBean("fpkt",Flipkart.class);
		//invoke business method
		String result=flipkartObj.shopping(new String[] {"shirt","pant","deo"}, new float[] {440.00f,960.00f,120f});
		System.out.println(result);
	}
}
