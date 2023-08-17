package com.mj.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	Courier courier;
	public Flipkart() {
		System.out.println("Flipkart 0-param constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart setCourier()");
		this.courier = courier;
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
