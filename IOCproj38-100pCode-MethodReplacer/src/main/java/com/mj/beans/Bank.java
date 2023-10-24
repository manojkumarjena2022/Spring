package com.mj.beans;

public class Bank {
	public double calculateCompoundIntrest(double pamt,double rate,double time)
	{
		System.out.println("Bank.calculateCompoundIntrest()");
		return (pamt*Math.pow(1+rate/100, time))-pamt;

	}
}
