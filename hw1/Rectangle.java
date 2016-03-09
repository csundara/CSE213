package com.csundaram.hw1;
/**
 * Main function for rectangle and sphere classes
 * 
 * @author Chandra Sundaram
 * @bugs 
 * 
 */
public class Rectangle {
	
	private double x;
	private double y;
	private double width;
	private double height;
	
	/** default constructor sets both coordinates and dimensions to 1*/
	public Rectangle(){
		this.x = 1;
		this.y = 1;
		this.width = 1;
		this.height = 1;
	}
	
	/** default coordinates/user implemented dimensions */
	public Rectangle(double userWidth, double userHeight){
		if(userWidth <= 0){			/** in case user try's inputting a negative number*/
			Math.abs(userWidth);
		}
		if(userHeight <= 0){		/** in case user try's inputting a negative number*/
			Math.abs(userHeight);
		}
		this.x = 1;
		this.y = 1;
		this.width = userWidth;
		this.height = userHeight;
	}
	
	/** user implemented dimensions and coordinates */
	public Rectangle(double userX, double userY, double userWidth, double userHeight){
		if(userWidth <= 0){			/** in case user try's inputting a negative number*/
			userWidth = 1;
		}
		if(userHeight <= 0){		/** in case user try's inputting a negative number*/
			userHeight = 1;
		}
		this.x = userX;
		this.y = userY;
		this.width = userWidth;
		this.height = userHeight;
	}
	 /** calculates area of rectangle*/
	public double area(){
		double area = width * height;
		return area;
	}
	
	/** calculates parameter of rectangle*/
	public double perimeter(){
		double perim = (2 * width) + (2 * height);
		return perim;
	}
	
	/** calculates length of diagonal in rectangle*/
	public double diagonalLength(){
		double root = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.pow(root, 0.5);
	}
	
	/** calculates distance from origin to upper right hand corner of rectangle */
	public double distanceFromOrigin(){
		double root = Math.pow(x, 2) + Math.pow(y, 2);
		return Math.pow(root, 0.5);
	}
}
