package com.csundaram.hw1;
/**
 * Main function for rectangle and sphere classes
 * 
 * @author Chandra Sundaram
 * @bugs 
 * 
 */
public class Sphere {
	private double x;
	private double y;
	private double z;
	private double radius;
	
	/** Default constructor sets all coordinates to 0 and radius to 1*/
	public Sphere(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.radius = 1;
	}
	
	/** Default coordinates/user implemented radius*/
	public Sphere(double userRadius){
		if(userRadius <= 0){
			userRadius = 1;
		}
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.radius = userRadius;
	}

	/** Default radius/user implemented coordinates*/
	public Sphere(double userX, double userY, double userZ){
		this.x = userX;
		this.y = userY;
		this.z = userZ;
		this.radius = 1;
	}

	/** user implemented coordinates and radius*/
	public Sphere(double userX, double userY, double userZ, double userRadius){
		if(userRadius <= 0){
			userRadius = 1;
		}
		this.x = userX;
		this.y = userY;
		this.z = userZ;
		this.radius = userRadius;
	}
	
	/** calculates volume of sphere */
	public double volume(){
		double volume = (4/3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	/** calculates surface area of sphere */
	public double surfaceArea(){
		double area = 4 * Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	/** calculates distance from origin to center of sphere*/
	public double distanceFromOrigin(){
		double root = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
		return Math.pow(root, 0.5);
	}
	
}
