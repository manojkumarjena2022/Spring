package com.mj.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Cricketer implements ApplicationContextAware {
	private ApplicationContext ctx;
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
		//perform dependency lookup
		CricketBat bat=ctx.getBean(batId,CricketBat.class);
		//use dependency class object
		int run=bat.scoreRuns();
		System.out.println("Crickter current score is :"+run);
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		System.out.println("Cricketer.setApplicationContext()");
		
	}
}
