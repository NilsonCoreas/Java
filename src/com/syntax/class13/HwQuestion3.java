package com.syntax.class13;

public class HwQuestion3 {

	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series.
		
		int a,b,c;
		a=0;
		b=1;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(a+" "); //out is 0 1 1 2 3 5 8 13 21
			c=a+b;
			a=b;
			b=c;
		}

	}

}
