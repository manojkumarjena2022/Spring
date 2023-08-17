package com.mj.test;

import com.mj.comp.Flipkart;
import com.mj.factory.FlipkartFactory;

public class StrategyDPTest {
	public static void main(String[] args) {
		//get target class object having dependent class object
		Flipkart flipkartObj=FlipkartFactory.getInstance();
		String result=flipkartObj.shopping(new String[] {"shirt","pant","deo"}, new float[] {440.00f,960.00f,120f});
		System.out.println(result);
	}
}
