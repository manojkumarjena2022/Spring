package com.mj.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mj.beans.Bank;
import com.mj.config.AppConfig;

public class MethodReplacerTest {

	public static void main(String[] args) {
		System.out.println("MethodReplacerTest.main()");
		//create IOC container
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		//get bean class object
		Bank bank=applicationContext.getBean("bank",Bank.class);
		System.out.println(bank.getClass()+"---------"+bank.getClass().getSuperclass());
		//invoke method
		double intrestAmount=bank.calculateCompoundIntrest(100000, 2, 12);
		System.out.println("Intrest Amount::="+intrestAmount);
		//close container
		applicationContext.close();

	}

}
