package com.mj.beans;

import java.util.Random;

public class CricketBat {
	public CricketBat() {
		System.out.println("CricketBat.CricketBat()");
	}
	public int scoreRuns()
	{
		System.out.println("CricketBat.scoreRuns()");
		return new Random().nextInt(200);
	}
}
