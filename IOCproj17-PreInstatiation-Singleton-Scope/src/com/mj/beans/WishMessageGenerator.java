package com.mj.beans;

import java.util.Date;

public class WishMessageGenerator {
	//ctrl+shift+o :: to import package
	Date date;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-param constructor");
	}
	//alt+shift+s,r -->select setter :: to get setter method
	public void setDate(Date date) {
		System.out.println("Wishmessagegenerator setter method");
		System.out.println("=====================");
		this.date = date;
	}
}
