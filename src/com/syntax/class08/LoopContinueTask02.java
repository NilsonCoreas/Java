package com.syntax.class08;

import java.util.Scanner;

public class LoopContinueTask02 {

	public static void main(String[] args) {
		/*
		Write a program that reads a range of integers (start and end point),
		 provided by a user and then from that range prints the sum of the even and odd integers.

Write a program to ask a user to enter item they want to buy and the price of that item. 
Every time user enters money accumulate the amount and tell the user how much is left to pay off the amount.
If user give more money program should return a change. Whenever a user done with payments program should say “Thank you for shopping!”
		 */
		Scanner scan=new Scanner(System.in);
		int totalEven=0;
		int totalOdd=0;
		
		System.out.println("Please enter two numbers: ");
		int min=scan.nextInt(); //10
		int max=scan.nextInt(); //20
		
		for(int i=min; i<=max; i++ ) {
			if(i%2==0) {
				totalEven=totalEven+i;
			}else {
				totalOdd=totalOdd+1; 
			}
		}
		System.out.println("The total of even numbers between " +min+" to "+max+ "");
		System.out.println("The total of odd numbers between "+min+" to "+max);
		
		System.out.println("---NEXT TASK---");
		
		/*
         * Write a program to ask a user to enter item they want to buy 
         * and the price of that item. 
         * Every time user enters money accumulate the amount 
         * and tell the user how much is left to pay off. 
         * If user give more money program should return a change. 
         * Whenever a user done with payments program should say 
         * "Thank you for shopping!"
         */
        
        Scanner s;
        String item;
        double price;
        double money;
        double amount=0;
        double change;
        double remainingBalance;
        
        s=new Scanner(System.in);
        System.out.println("What are you byuing today");
        item=s.nextLine();
        
        System.out.println("What is the price for the "+item);
        price=s.nextDouble();
        do {
            System.out.println("Please give payment");
            money=s.nextDouble();
            amount=amount+money;
            
            if(amount<price) {
                remainingBalance=price-amount;
                System.out.println("Please give more "+remainingBalance);
            }else if(amount>price) {
                change=amount-price;
                System.out.println("Here is your change "+change);
                break;
            }
            
        }while(price!=amount);
        
        System.out.println("Thank you for shopping");
    }
}
