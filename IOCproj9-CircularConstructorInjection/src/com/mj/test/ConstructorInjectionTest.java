package com.mj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mj.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		System.out.println("main()");
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		//get Xml reader
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		//load config file
		reader.loadBeanDefinitions("com/mj/cfgs/applicationContext.xml");
		//get target bean class object
		WishMessageGenerator wmg=(WishMessageGenerator)factory.getBean("wmg");
		//invoke the business method
		System.out.println("result="+wmg.generateWishMessage());

	}
}
//Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'wmg'