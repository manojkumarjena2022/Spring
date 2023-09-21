package com.mj.sdp;

public class Printer {
//private static printer instance
	private static Printer INSTANCE;
	private Printer() {
		System.out.println("Printer 0-param const");
	}
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}
	public void print(String msg) {
		System.out.println(msg);
	}
}
