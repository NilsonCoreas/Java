package com.syntax.class02;

public class ArithmeticPractice {
	public static void main (String [] args) {
		
		float num1=1.5f;
		float num2=2.5f;
		float sum1=num1+num2;
		float sub1=num1-num2;
		float mult=num1*num2;
		float div=num1/num2;
		float squareRoot=3.9f;
		int width=5;
		int height=8;
		int area=width * height;
		int perimeter=2*(width*height);
		int number1=4;
		
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+" is equal to "+sum1);
		double s=3.9;
		double s2=s * s;
		System.out.println("The square of the "+s+" is "+s2);
		System.out.println("The perimeter of a rectangle with width "+width + "and height" + height + " is equal to "+ perimeter + " and the area is " + area);
	    System.out.println("The adding of 2 numbers "+num1+" and "+num2+" is equal to "+(num1+num2));
	
	// modulus (results are whats left after division)
	    int v=16;
	    int w=7;
	    int mod=v%w;
	    System.out.println(mod);
	    
	    //int num1=12.5 not possible to store decimals into int
	    double num2=12;
	    double num3=7;
	    
	}

}
