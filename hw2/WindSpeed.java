package com.csundaram.hw2;

public class WindSpeed {
	
	double mph = 10;	//test instance
	
	/** constructor */
	public WindSpeed(double mph){
		this.mph = mph;
	}
	
	/** converts miles per hour to meters per second*/
	public double toMetersPerSecond(){
		double mps = mph * 1609.34/3600;
		return mps;
	}
	
}
