package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Prompt the user to enter person heights in inches. Person should be classified as one of the following:
		//short (under 60 inch)
		//medium(between 60 -72 inch)
		//tall (over 72 inch)


		//Write a program that will print whether it is a weekend or weekday.
		//If any day from 1-5 → output “It is a weekday”, 
		//anyday from 6-7 → output “It is a weekend”,
		//any other day → output “Invalid day”
	//Scanner scan;  
	//scan=new Scanner(System.in); 
	//System.out.println("Please enter your height in inches");
	
	//int height;
	//height=scan.nextInt();  
	
	//if (height<60) {
		//System.out.println("You're  short");
	//}else if (height>=60 && height<=72) {
	//	System.out.println(" You're medium");
	//}else if (height>72) {
	//	System.out.println("Youre tall"); 
//	} else {
	//	System.out.println("Invalid height");
//	}
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please enter the day number");
	int day=scan.nextInt();
	
	if(day>=1 && day<=5) {
		System.out.println("It is a week day");
	}else if (day>=6 && day<=7) {
		System.out.println("It is a weekend");
	}else {
		System.out.println("Invalid day");

	  
	
	     
}

}
}
