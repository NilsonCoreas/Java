package com.syntax.class08;

public class LoopReviewDoWhile {

	public static void main(String[] args) {
		//kid bdays until age 10
		//similarity between while&do-while
		int age=0; //just born
		
		while(age < 10) {
			age++; //this will continue the loop 
			System.out.println("Happy Birthday! You are " + age + " years old.");
		}
		System.out.println("Now you are grown! You don't need a birthday celebration.");
		
		int age2=0; //second son just born
		do {
			age2++;
			System.out.println("Happy Birthday! You are " + age2 + " years old.");
		}while(age2 < 10);
		System.out.println("Now you are grown! You don't need a birthday celebration.");
		
		//Differennce between while&do-while
		String greeting = "Hi"; //while loop
		boolean happy = false;
		while(happy) { //(!happy) will turn it into true statement
			System.out.println(greeting + "inside while");
		}
		do { //do while will execute at least one time if the codition is false 
			System.out.println(greeting+ "inside do while");
			break;
		}while(happy);
	}

}
