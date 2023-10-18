package com.mj.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("fpkt")
@Scope("singleton")
public class Flipkart {
	@Autowired
	@Qualifier("cr")
	Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}
	
	//business method
	public String shopping(String[] items,float[] prices) {
		float billAmount=0.0f;
		for(float p:prices)
			billAmount+=p;
		int oid=new Random().nextInt(1000);
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+" prices "+Arrays.toString(prices)+" having bill amount "+billAmount+":::"+msg;
	}

}
