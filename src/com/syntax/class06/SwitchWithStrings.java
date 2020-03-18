package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/*Ask user where he or she is from
		 * based on the country we will define fav food
		 * Your fav food is ___
		 * 
		 */
		
		Scanner scan;
		String country;
		String favFood;
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country.toLowerCase()) { 	//with toLowerCase everything must be lower cased
		
		case "usa":
			favFood="burger";
			break;
		case "el salvador":
			favFood="pupusas";
			break;
		case "mexico":
			favFood="tacos";
			break;
		default:
			favFood="anything";
	
		}
		System.out.println("Your favorite food is " + favFood);
		
		

	}

}
