package com.csundaram.hw1;

import java.util.Scanner;

/**
 * Main function for rectangle and sphere classes
 * 
 * @author Chandra Sundaram
 * @bugs 
 * 
 */
public class Test {
	public static void main(String[] args){
		
		Rectangle rectangle1 = new Rectangle();
		Sphere sphere1 = new Sphere();
		int loop = 0;
		double returnVal = 0;
		String opt = null;
		Scanner userScan = new Scanner(System.in);
		
		while(loop == 0){
			System.out.println("1)rectangle" + System.lineSeparator() + "2)sphere" + System.lineSeparator() + "3)exit");
			opt = userScan.nextLine();
			String[] makeSwitch = opt.split(" ");
			
			switch(makeSwitch[0].toLowerCase()){
			case "rectangle" :
				returnVal = rectangle1.area();
				System.out.println("the area of the rectangle is " + returnVal + "\n");
				returnVal = rectangle1.perimeter();
				System.out.println("the parameter is " + returnVal + "\n");
				returnVal = rectangle1.diagonalLength();
				System.out.println("the diagonal length of the rectangle is " + returnVal + "\n");
				returnVal = rectangle1.distanceFromOrigin();
				System.out.println("the distance of the lower left hand corner to the origan is " + returnVal + "\n");
				
				System.out.println("enter height:");
				opt = userScan.nextLine();
				double height = Double.parseDouble(opt);
				System.out.println("enter width:");
				opt = userScan.nextLine();
				double width = Double.parseDouble(opt);
				Rectangle rectangle2 = new Rectangle(width, height);
				returnVal = rectangle2.area();
				System.out.println("the area of the rectangle is " + returnVal + "\n");
				returnVal = rectangle2.perimeter();
				System.out.println("the parameter is " + returnVal + "\n");
				returnVal = rectangle2.diagonalLength();
				System.out.println("the diagonal length of the rectangle is " + returnVal + "\n");
				returnVal = rectangle2.distanceFromOrigin();
				System.out.println("the distance of the lower left hand corner to the origan is " + returnVal + "\n");
				
				System.out.println("enter height:");
				opt = userScan.nextLine();
				height = Double.parseDouble(opt);
				System.out.println("enter width:");
				opt = userScan.nextLine();
				width = Double.parseDouble(opt);
				System.out.println("enter X coordinate of lower left hand corner:");
				opt = userScan.nextLine();
				double x = Double.parseDouble(opt);
				System.out.println("enter Y coordinate of lower left hand corner:");
				opt = userScan.nextLine();
				double y = Double.parseDouble(opt);
				Rectangle rectangle3 = new Rectangle(x, y, width, height);
				returnVal = rectangle3.area();
				System.out.println("the area of the rectangle is " + returnVal + "\n");
				returnVal = rectangle3.perimeter();
				System.out.println("the parameter is " + returnVal + "\n");
				returnVal = rectangle3.diagonalLength();
				System.out.println("the diagonal length of the rectangle is " + returnVal + "\n");
				returnVal = rectangle3.distanceFromOrigin();
				System.out.println("the distance of the lower left hand corner to the origan is " + returnVal + "\n");
				break;
			case "sphere" :
				returnVal = sphere1.volume();
				System.out.println("the volume of the sphere is " + returnVal + "\n");
				returnVal = sphere1.surfaceArea();
				System.out.println("the surface area of the sphere is " + returnVal + "\n");
				returnVal = sphere1.distanceFromOrigin();
				System.out.println("the distance of the center of the sphere to the origin is " + returnVal + "\n");
				
				System.out.println("enter radius:");
				opt = userScan.nextLine();
				double rad = Double.parseDouble(opt);
				Sphere sphere2 = new Sphere(rad);
				returnVal = sphere2.volume();
				System.out.println("the volume of the sphere is " + returnVal + "\n");
				returnVal = sphere2.surfaceArea();
				System.out.println("the surface area of the sphere is " + returnVal + "\n");
				returnVal = sphere2.distanceFromOrigin();
				System.out.println("the distance of the center of the sphere to the origin is " + returnVal + "\n");

				System.out.println("enter X coordinate of lower left hand corner:");
				opt = userScan.nextLine();
				double centerX = Double.parseDouble(opt);
				System.out.println("enter Y coordinate of lower left hand corner:");
				opt = userScan.nextLine();
				double centerY = Double.parseDouble(opt);
				System.out.println("enter Z coordinate of lower left hand corner:");
				opt = userScan.nextLine();
				double centerZ = Double.parseDouble(opt);
				Sphere sphere3 = new Sphere(centerY, centerX, centerZ);
				returnVal = sphere3.volume();
				System.out.println("the volume of the sphere is " + returnVal + "\n");
				returnVal = sphere3.surfaceArea();
				System.out.println("the surface area of the sphere is " + returnVal + "\n");
				returnVal = sphere3.distanceFromOrigin();
				System.out.println("the distance of the center of the sphere to the origin is " + returnVal + "\n");
				
				System.out.println("enter radius:");
				opt = userScan.nextLine();
				rad = Double.parseDouble(opt);
				System.out.println("enter X coordinate of lower left hand corner:");
				opt = userScan.nextLine();
				centerX = Double.parseDouble(opt);
				System.out.println("enter Y coordinate of lower left hand corner:");
				opt = userScan.nextLine();
				centerY = Double.parseDouble(opt);
				System.out.println("enter Z coordinate of lower left hand corner:");
				opt = userScan.nextLine();
				centerZ = Double.parseDouble(opt);
				Sphere sphere4 = new Sphere(centerY, centerX, centerZ, rad);
				returnVal = sphere4.volume();
				System.out.println("the volume of the sphere is " + returnVal + "\n");
				returnVal = sphere4.surfaceArea();
				System.out.println("the surface area of the sphere is " + returnVal + "\n");
				returnVal = sphere4.distanceFromOrigin();
				System.out.println("the distance of the center of the sphere to the origin is " + returnVal + "\n");
				break;
			case "exit" :
				loop = -1;
				System.out.println("Goodbye");
				break;
			default :
				break;
			}
		}
		userScan.close();
	}
}
