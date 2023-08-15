package com.mj.beans;

import java.util.Date;

public class WishMessageGenerator {
	//ctrl+shift,o :: to import package
	Date date;
	//shift+alt+s,o :: to get parameterized constructor
	public WishMessageGenerator(Date date) {
		//type syso then ctrl_spacebar
		System.out.println("WishMessageGenerator: 1-param constructor");
		this.date = date;
	}
	public String getMessage(String user)
	{
		System.out.println("WishMessageGenerator:: getMessage()");
		//get current hour from date object
		int hour=date.getHours();//24 hours format
		if(hour<12)
			return "Good Morning "+user;
		if(hour<16)
			return "Good Afternoon "+user;
		if(hour<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}
}
