package com.syntax.class09;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		// create an array and store names of our classes
		
		String[] syntaxClasses= {"SDLC", "Manual Testing", "Java", "GIT"}; //{} indicates to store multiple values
		//Today we have Java class. starts from 0,1,2,3,4,5 and so on
		System.out.println("Today we have " + syntaxClasses[2] + " class");
		
		double[] numbers= {1.2, 2.3, 3.4, 4.5};
		
		//int[] num; Compiler will give an error
		//num={};
	}

}
