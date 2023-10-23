package com.mj.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cricketer {
	String batId;
	public Cricketer(String batId) {
		this.batId=batId;
		System.out.println("Cricketer.Cricketer()");
	}
	public void fielding()
	{
		System.out.println("Cricketer.fielding()");
	}
	public void bowling()
	{
		System.out.println("Cricketer.bowling()");
	}
	public void wicketKeeping()
	{
		System.out.println("Cricketer.enclosing_method()");
	}
	public void batting()
	{
		System.out.println("Cricketer.batting()");
		//create an extra ioc container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/mj/cfgs/applicationContext.xml");
		System.out.println("Cricketer.batting() extra IOC container created");
		//perform dependency lookup
		CricketBat bat=ctx.getBean(batId,CricketBat.class);
		//use dependency class object
		int run=bat.scoreRuns();
		System.out.println("Crickter current score is :"+run);
	}
}
