package com.mj.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mj.beans.WishMessageGenerator;

public class SetterInjectionTest {
public static void main(String[] args) {
	System.out.println("main()");
	FileSystemResource res=new FileSystemResource("src/com/mj/cfgs/applicationContext.xml");
	XmlBeanFactory factory=new XmlBeanFactory(res);
	WishMessageGenerator wmg=(WishMessageGenerator)factory.getBean("wmg");
	System.out.println("result="+wmg.generateWishMessage("MJ Kumar"));
}
}
