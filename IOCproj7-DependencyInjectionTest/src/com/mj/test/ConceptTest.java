package com.mj.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mj.beans.Person;
import com.mj.beans.Person1;

public class ConceptTest {
	public static void main(String[] args) {
		System.out.println("main()");
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		//get xml defination reader
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mj/cfgs/applicationContext.xml");
		Person p1=(Person)factory.getBean("per");
		System.out.println(p1);
		System.out.println(p1.getDetails());
		System.out.println("================");
		Date date=new Date();
		Person p=new Person();
		System.out.println(date);
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("================");
		Class c1=Date.class;
		Class c2=Person.class;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("================");
		Person p2=factory.getBean("per",Person.class);
		System.out.println(p2);
		//Raise exception :BeanNotOfRequiredTypeException
		/*
		 * Person1 p3=factory.getBean("per",Person1.class);
		 * System.out.println(p3);
		 */
	}
}
