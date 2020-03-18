package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/*
		 *write a program to ask a user if there is a sale 
		 * if no sale--> not going shopping
		 * if sale we will ask the price of the item
		 * based on the price we will apply discount and calculate final price
		 * if price less than 20 --> apply 10% discount
		 * if price between 20-100--> apply 20% discount
		 * if price between 100-500--> apply 30% discount
		 * if price more than 500--> aplply 50% discount
		 * 
		 * After discount _____ the price of the item reduced from ___ to ____
		 */
		Scanner scan;
		String sale;
		double price;
		double discount = 0;
		double finalPrice = 0;
		price=90;
	
	scan=new Scanner(System.in);
	System.out.println("Is there  a sale");
	sale=scan.nextLine();
	
	if(sale.equalsIgnoreCase("Yes")) {
		System.out.println("What is the price");
		price=scan.nextDouble();
		
		if (price<=20) {
			discount=price*0.1;
			
		}else if (price>20 && price<100) {
			discount=price*.20;
			
		}else if (price>100 && price<500) {
			discount=price*.3;
			
		}else if (price>500) {
			discount=price*.5;
			
		}
		finalPrice=price-discount;
		System.out.println("After " + discount +" discount the price of the item reduced from " +price+ " to " +finalPrice);
		
	}else {
		System.out.println("No shopping today");
	}
	
	
	
	}
}


