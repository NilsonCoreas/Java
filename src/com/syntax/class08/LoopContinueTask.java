package com.syntax.class08;

import java.util.Scanner;

public class LoopContinueTask {

	public static void main(String[] args) {
		/*Print numbers from 1 to 50 except those that are divisible by 3
		 * 
Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.

		
		 */
		for(int i=1; i<=50; i++) {	//task 1
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("---NEXT TASK---");
		 Scanner scan = new Scanner(System.in);
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Do you want to apply for a credit card");
	            String creditCard=scan.next();
	            if (creditCard.equalsIgnoreCase("Yes")) {
	                System.out.println("Congrat! you got a credit card");
	                break;
	            }
	        }
	        
	}
}

		
		

	


