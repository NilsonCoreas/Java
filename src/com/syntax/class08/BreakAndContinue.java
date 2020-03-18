package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {

		// once i=4 --> stop the loop

		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
	
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		
		System.out.println("---CONTINUE---");
		
		for(int y=1; y<=10; y++) {
			if(y==4) {	//will skip this number 
				System.out.println("Im skipping iteration");
				continue;
			}
			
			System.out.println(y);
		}
		//write a program that prints numbers from 1 to 20
		//I dont want to print 567
		for(int i=1; 1<21; i++) {
			if(i==5 || i==6 || i==7) { //got to use OR || since && wouldn't be true
				continue;
			}
			System.out.println(i);
		}
		//write program from 1-100
		//skip 35-55
		for (int i=1; i<=100; i++) {
			if(i>=35 && i<=55) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
