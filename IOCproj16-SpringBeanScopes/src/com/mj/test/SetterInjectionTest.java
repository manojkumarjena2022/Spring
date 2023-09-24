package com.mj.test;

import java.util.Arrays;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mj.beans.Printer;
import com.mj.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mj/cfgs/applicationContext.xml");
		//get target bean class object
		WishMessageGenerator wmg1=factory.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wmg2=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg1.hashCode()+" "+wmg2.hashCode());
		System.out.println("wmg1==wmg2?"+(wmg1==wmg2));//true
		System.out.println("==================================");
		WishMessageGenerator wmg3=factory.getBean("wmg1",WishMessageGenerator.class);
		WishMessageGenerator wmg4=factory.getBean("wmg1",WishMessageGenerator.class);
		System.out.println(wmg3.hashCode()+" "+wmg4.hashCode());
		System.out.println("wmg3==wmg4?"+(wmg3==wmg4));//true
		System.out.println("==================================");
		Printer p1=factory.getBean("printer", Printer.class);
		Printer p2=factory.getBean("printer", Printer.class);
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2?"+(p1==p2));//true
		System.out.println("==================================");
		Printer p3=factory.getBean("printer2", Printer.class);
		Printer p4=factory.getBean("printer2", Printer.class);
		System.out.println(p3.hashCode()+" "+p4.hashCode());
		System.out.println("p3==p4?"+(p3==p4));//true
		System.out.println("==================================");
		Printer p5=factory.getBean("printer3", Printer.class);
		Printer p6=factory.getBean("printer4", Printer.class);
		System.out.println(p5.hashCode()+" "+p6.hashCode());
		System.out.println("p5==p6?"+(p5==p6));//true
		System.out.println("==================================");
		System.out.println("Prototype Scope");
		System.out.println("==================================");
		WishMessageGenerator wmg5=factory.getBean("wmg2",WishMessageGenerator.class);
		WishMessageGenerator wmg6=factory.getBean("wmg2",WishMessageGenerator.class);
		System.out.println(wmg5.hashCode()+" "+wmg6.hashCode());
		System.out.println("wmg5==wmg6?"+(wmg5==wmg6));//false
		System.out.println("==================================");
		Printer p7=factory.getBean("printer5", Printer.class);
		Printer p8=factory.getBean("printer5", Printer.class);
		System.out.println(p7.hashCode()+" "+p8.hashCode());
		System.out.println("p7==p8?"+(p7==p8));//true
		System.out.println("==================================");
		System.out.println("beans count::"+factory.getBeanDefinitionCount());
		System.out.println("bean ids::"+Arrays.toString(factory.getBeanDefinitionNames()));
		System.out.println("==================================");
		//invoke the business method
		System.out.println("result="+wmg1.generateWishMessage("MJ Kumar"));
	}
}
//ctrl+F11 to run as java application