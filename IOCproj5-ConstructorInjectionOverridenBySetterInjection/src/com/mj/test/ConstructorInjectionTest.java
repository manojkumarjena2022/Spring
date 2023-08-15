package com.mj.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mj.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		System.out.println("Main()");
		//locate and get spring bean configuration file
		FileSystemResource resource=new FileSystemResource("src/com/mj/cfgs/applicationContext.xml");
		//create bean factory object
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		//get target bean class object
		Object obj=factory.getBean("wmg");
		//type cast to target class
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		//invoke business logic
		String result=generator.getMessage("Manoj");
		//print result
		System.out.println(result);

	}
}
