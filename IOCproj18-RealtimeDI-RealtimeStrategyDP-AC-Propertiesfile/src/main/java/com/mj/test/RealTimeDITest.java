package com.mj.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.mj.controller.MainController;
import com.mj.vo.CustomerVO;

public class RealTimeDITest {
	public static void main(String[] args) {
		//read inputs from enduser as string values
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name::");
		String custName=sc.next();
		System.out.println("Enter Customer address::");
		String custAddrs=sc.next();
		System.out.println("Enter Customer principle amount::");
		String pamt=sc.next();
		System.out.println("Enter Customer rate of intrest::");
		String rate=sc.next();
		System.out.println("Enter Customer time of intrest");
		String time=sc.next();
		//create customerVO class object
		CustomerVO vo=new CustomerVO();
		vo.setCustName(custName);
		vo.setCustAddrs(custAddrs);
		vo.setPamt(pamt);
		vo.setRate(rate);
		vo.setTime(time);
		//create IOC container
		//		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		//		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		//		reader.loadBeanDefinitions("com/mj/cfgs/applicationContext.xml");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/mj/cfgs/applicationContext.xml");
		//get Controller class obj
		MainController controller=ctx.getBean("controller",MainController.class);
		//invoke the methods
		try {
			String result=controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal problem-Try Again");
		}
		Environment env=ctx.getEnvironment();
		System.out.println("====================================");
		System.out.println(env.getClass()+" "+env.getRequiredProperty("os.name"));
		System.out.println("====================================");
		//close container
		ctx.close();
		System.out.println(System.getProperties());
	}

}
