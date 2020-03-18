package com.syntax.class07;

public class ForLoopIntro {

	public static void main(String[] args) {
		// Good morning 5 times, use for loop when you know how many times you have to print it out 
		for(int c=1; c<6; c++) {
			System.out.println("Good morning");
		}
		//print numberd from 1-10
		for(int i=1; 1<=10; i++) {
			System.out.println(i);
		}
		//print numberd from 10-1
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		//what will be the output
		for(int i=0; i<=50; i++) {
			System.out.println(i);
		}
		//what is the output
		int sum=0;
		
		for(int i=1; i<5; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
