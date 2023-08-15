package com.mj.beans;

import java.util.Date;

public class WishMessageGenerator {
	//ctrl+shift+o :: to import package
	Date date;
	static {
		System.out.println("static block executed");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator 0-param constructor");
	}
	//alt+shift+s,r -->select setter :: to get setter method
	public void setDate(Date date) {
		System.out.println("Wishmessagegenerator setter method");
		this.date = date;
	}
	public String generateWishMessage(String user) {
		System.out.println("generateWish  method executed");
		//get current hour of day
		int hour=date.getHours();//24 hour format
		if (hour<12) {
			return "Good Morning "+user;
		}
		else if (hour<16) {
			return "Good Afternoon "+user;
		}
		else if (hour<20) {
			return "Good Evening "+user;
		}
		else {
			return "Good Night "+user;
		}

	}
	
	

}
