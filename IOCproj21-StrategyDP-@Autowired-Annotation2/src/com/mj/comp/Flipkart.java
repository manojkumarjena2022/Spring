package com.mj.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	@Autowired
	@Qualifier("fedx")
	Courier courier;
	
	@Autowired
	public Flipkart(@Qualifier("dtdc")Courier courier) {
		this.courier=courier;
		System.out.println("Flipkart courier-param constructor");
	}
	
	
	@Autowired
	@Qualifier("dtdc")
	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
	}
	
	@Autowired
	@Qualifier("fedx")
	public void assign(Courier courier) {
		this.courier=courier;
		System.out.println("Flipkart.assign()");
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
