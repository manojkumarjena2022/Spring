package com.mj.beans;

public class User {
private String userName;
WishMessageGenerator wmg;
public User() {
	System.out.println("User :: 0-param constructor");
}
public WishMessageGenerator getWmg() {
	System.out.println("User :: getWmg()");
	return wmg;
}

public void setWmg(WishMessageGenerator wmg) {
	System.out.println("User :: setWmg()");
	this.wmg = wmg;
}

public String getUserName() {
	System.out.println("User :: getUserName()");
	return userName;
}

public void setUserName(String userName) {
	System.out.println("User :: setUserName()");
	this.userName = userName;
}

}
