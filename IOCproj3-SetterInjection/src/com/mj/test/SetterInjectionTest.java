package com.mj.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.mj.beans.WishMessageGenerator;

public class SetterInjectionTest {
public static void main(String[] args) {
	System.out.println("main()");
	//locate and hold spring configuration file
	FileSystemResource res=new FileSystemResource("src/com/mj/cfgs/applicationContext.xml");
	//create IOC container
	XmlBeanFactory factory=new XmlBeanFactory(res);
	//get target bean class object
	WishMessageGenerator wmg=(WishMessageGenerator)factory.getBean("wmg");
	//invoke the business method
	System.out.println("result="+wmg.generateWishMessage("MJ Kumar"));
}
}
//ctrl+F11 to run as java application