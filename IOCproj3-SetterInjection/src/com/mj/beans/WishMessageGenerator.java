package com.mj.beans;

import java.util.Date;

public class WishMessageGenerator {
	Date date;
	static {
		System.out.println("static block executed");
	}
	public WishMessageGenerator() {
		// TODO Auto-generated constructor stub
		System.out.println("WishMessageGenerator 0-param constructor");
	}

	public void setDate(Date date) {
		System.out.println("Wishmessagegenerator setter method");
		this.date = date;
	}
	public String generateWishMessage(String user) {
		// TODO Auto-generated method stub
		System.out.println("generateWish  method executed");
		int hour=date.getHours();
		if (hour<12) {
			return "Good Morning "+user;
			
		}
		else if (hour<16) {
			return "Good Afternoon "+user;
		}
		else if (hour<20) {
			return "Good Morning "+user;
		}
		else {
			return "Good Night "+user;
		}

	}
	
	

}
