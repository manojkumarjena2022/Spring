package com.mj.beans;

public interface Cricketer {
	
	public abstract CricketBat createCricketBat();
	
	public default void fielding()
	{
		System.out.println("Cricketer.fielding()");
	}
	public default void bowling()
	{
		System.out.println("Cricketer.bowling()");
	}
	public default void wicketKeeping()
	{
		System.out.println("Cricketer.enclosing_method()");
	}
	public default void batting()
	{
		System.out.println("Cricketer.batting()");
		//call lookup method
		CricketBat bat=createCricketBat();
		//use dependency class object
		int run=bat.scoreRuns();
		System.out.println("Crickter current score is :"+run);
	}

}
