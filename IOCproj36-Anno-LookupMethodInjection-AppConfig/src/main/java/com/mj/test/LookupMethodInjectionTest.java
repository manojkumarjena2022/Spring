package com.mj.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mj.beans.Cricketer;
import com.mj.config.AppConfig;

public class LookupMethodInjectionTest {

	public static void main(String[] args) {
		//create IOC
		AnnotationConfigApplicationContext cpxac=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("LookupMethodInjectionTest.main()");
		//get bean class object
		Cricketer cricketer=cpxac.getBean("cricketer",Cricketer.class);
		System.out.println(cricketer.getClass()+".........."+cricketer.getClass().getSuperclass()+"......"+Arrays.toString(cricketer.getClass().getDeclaredMethods()));
		//use bean object
		cricketer.bowling();
		cricketer.fielding();
		cricketer.wicketKeeping();
		cricketer.batting();
		//close IOC
		cpxac.close();

	}

}
