package com.mj.beans;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("bat")
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
