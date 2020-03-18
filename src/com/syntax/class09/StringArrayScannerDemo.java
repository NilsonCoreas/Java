package com.syntax.class09;

import java.util.Scanner;

public class StringArrayScannerDemo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("How many animals do you have?");
		int length = scan.nextInt();
		
		String[] animals = new String[length];
		
		for(int count= 0; count < length; count++) {
			System.out.println("Give me an animal.");
			String animal = scan.nextLine();
			animals[count]= animal;
		}
		
		
		

	}

}
