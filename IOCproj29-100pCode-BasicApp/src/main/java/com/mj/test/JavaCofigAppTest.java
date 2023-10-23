package com.mj.test;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mj.beans.WishMessageGenerator;
import com.mj.config.AppConfig;

public class JavaCofigAppTest {

	public static void main(String[] args) {
		//IOC container
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(AppConfig.class);
		//get target class
		WishMessageGenerator wmg=acac.getBean("wmg",WishMessageGenerator.class);
		//invoke b.method
		System.out.println(wmg.generateMessage("MJ"));
		LocalDateTime ldt=acac.getBean("createLocalDateTime",LocalDateTime.class);
		System.out.println("LocalDateTime bean id :"+ldt);
		acac.close();
	}

}
