package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkWeek5 {

//type main ctrl+space shortcut for main method
	public static void main(String[] args) {
		/* If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
		Scanner userInput = new Scanner(System.in);
		System.out.print("Do you use credit card? ");
		
		String answer = userInput.nextLine(); //boolean answer1=input.nextBoolean();
		if (answer.equals("Yes")){ //(answer1.equals("Yes"))
			System.out.print("what is the current balance on your credit card?");
			double c=userInput.nextDouble();
			if (c>=1000) {
				System.out.println("Please pay off your dues immediately");
			}else {
				System.out.println("Please spend more to get higher credit limit");
			}
		} else {
			System.out.println("We have a great Credit Card offer for you. Are you interested?");
		}
		System.out.println("---------------------");
		//Task-2:
		/* Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus, 
		 * otherwise he is not. 
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, 
		 * otherwise bonus=3000.
		 */
		System.out.print("How long you are working with the company? ");
		int year = userInput.nextInt();
		System.out.print("What is your Annual Salary? ");
		double salary = userInput.nextDouble();
		if (year>=5) {
			System.out.println("You are eligible for Bonus!!");
			if (salary>=50000) {
				System.out.println("Your bonus amount is 5000.");
			} else {
				System.out.println("Your bonus amount is 3000.");
			}
		} else {
			System.out.println("Sorry, You are not Eligible for Bonus untill you reach 5 year.");
		}
		userInput.close();

	}

}
