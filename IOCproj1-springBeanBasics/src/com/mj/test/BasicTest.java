package com.mj.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mj.beans.WelcomeGreetings;

public class BasicTest {

	public static void main(String[] args) {
		System.out.println("main()");
		//locate and hold spring bean cfg file
		FileSystemResource res=new FileSystemResource("src/com/mj/cfgs/applicationContext.xml");
		//create IOC container(XMLBeanFactory)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get spring class objects from SpringContainer/IOC Container
		Date d=(Date) factory.getBean("dt");
		System.out.println("d obj data:-"+d);
		System.out.println("--------------------");
		WelcomeGreetings wg=(WelcomeGreetings)factory.getBean("wg");
		System.out.println("message::"+wg.welcome("MJ kumar"));
		
	}
}
