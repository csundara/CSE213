package com.csundaram.hw2;
/**
 * Main function for rectangle and sphere classes
 * 
 * @author Chandra Sundaram
 * @bugs 
 * 
 */
public class Point {
	double x;
	double y;
	double r;
	double theta;
	enum Coordinate{
		CARTESIAN, POLAR
	}
	
	/**public Point setter(){
		
	}*/
	
	private Point(double x, double y, enum Coordinate){
		switch(coordinate){
		case CARTESIAN :
			this.x = x;
			this.y = y;
			cartesianInstance(x, y);
			break;
		case POLAR :
			this.r = x;
			this.theta = y;
			break;
		}
		
	}
	
	private void cartesianInstance(double x, double y){
		this.r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		this.theta = Math.atan(y/x);
	}
	
	private void polarInstance(double r, double theta){
		this.x = r * Math.sin(theta);
		this.y = r * Math.cos(theta);
	}
	
	public double eudlideanDistance(Point q){
		return Math.sqrt((Math.pow((q.x - this.x), 2) + Math.pow((q.y + this.y), 2)));		
	}
	
	public static double eudlideanDistance(Point p, Point q){
		return Math.sqrt((Math.pow((q.x - p.x), 2) + Math.pow((q.y + p.y), 2)));
	}
	
	public double manhattanDistance(Point q){
		return Math.abs(q.x - this.x) + Math.abs(q.y - this.y);		
	}
	
	public static double manhattanDistance(Point p, Point q){
		return Math.abs(q.x - p.x) + Math.abs(q.y - p.y);
	}
	
}
