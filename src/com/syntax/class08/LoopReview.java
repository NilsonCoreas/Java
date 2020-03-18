package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		Scanner s;
		double price;
		
		s=new Scanner(System.in);
		//do {
		System.out.println("Please pay for a candy");
		price=s.nextDouble();
		
	while(price !=2);{
		
		System.out.println("Please pay for a candy");
		price=s.nextDouble();
	}
	System.out.println("Enjoy your candy");
	}
}
