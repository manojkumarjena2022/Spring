package com.mj.beans;
import java.util.Date;
public class WishMessageGenerator {
	//ctrl+shift+o :: to import package
	User user;
	static {
		System.out.println("WishMessageGenerator static block executed");
	}
	public WishMessageGenerator(User user) {
		System.out.println("WishMessageGenerator 1-param constructor");
		this.user=user;
	}
	public String generateWishMessage() {
		System.out.println("generateWishMessage() executed");
		Date date=new Date();
		//get current hour of day
		int hour=date.getHours();//24 hour format
		if (hour<12) {
			return "Good Morning "+ user.getUserName();
		}
		else if (hour<16) {
			return "Good Afternoon "+ user.getUserName();
		}
		else if (hour<20) {
			return "Good Evening "+ user.getUserName();
		}
		else {
			return "Good Night "+ (user.getUserName());
		}

	}
	
	

}
