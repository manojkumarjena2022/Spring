package com.mj.test;

import com.mj.beans.Robot;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

	public static void main(String[] args) {
		//create IOC
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/mj/cfgs/applicationContext.xml");
		Robot robot=applicationContext.getBean("robo",Robot.class);
		System.out.println(robot);

		/* Default bean ID */
		//Robot robot1=applicationContext.getBean("com.mj.beans.Robot",Robot.class); //OR
		/*
		 * Robot robot1=applicationContext.getBean("com.mj.beans.Robot#0",Robot.class);
		 * System.out.println(robot1); Robot
		 * robot2=applicationContext.getBean("com.mj.beans.Robot#1",Robot.class);
		 * System.out.println(robot2);
		 */
	}

}
