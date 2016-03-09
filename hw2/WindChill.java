package com.csundaram.hw2;

public class WindChill {
	
	static double theWindChill;
	
	/** calculates wind chill */
	public static double getWindChill(Temperature t, WindSpeed w){
		return theWindChill = 35.74 + (0.6215 * t.getFahrenheit())-(35.75 * w.mph)+(0.4275 * t.getFahrenheit() * w.mph);
	}
	
	/** calculates wind chill in watts/meter squared */
	public static double getWindChillWatts(Temperature t, WindSpeed w){
		return theWindChill = (12.1452 + 11.6222 * Math.sqrt(w.toMetersPerSecond()) - 1.16222 * w.toMetersPerSecond()) * (33 - t.getCelsius());
	}
}
