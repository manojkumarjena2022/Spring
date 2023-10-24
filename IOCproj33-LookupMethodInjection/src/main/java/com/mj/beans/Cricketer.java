package com.mj.beans;

public abstract class Cricketer {
	
	public abstract CricketBat createCricketBat();
	
	public Cricketer() {
		System.out.println("Cricketer.Cricketer()");
	}
	public void fielding()
	{
		System.out.println("Cricketer.fielding()");
	}
	public void bowling()
	{
		System.out.println("Cricketer.bowling()");
	}
	public void wicketKeeping()
	{
		System.out.println("Cricketer.enclosing_method()");
	}
	public void batting()
	{
		System.out.println("Cricketer.batting()");
		//call lookup method
		CricketBat bat=createCricketBat();
		//use dependency class object
		int run=bat.scoreRuns();
		System.out.println("Crickter current score is :"+run);
	}

}
