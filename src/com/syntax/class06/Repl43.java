package com.syntax.class06;

import java.util.Scanner;

public class Repl43 {

	public static void main(String[] args) {
		/*Write a program to input number "Input a number between 1-12" and when you input a number it should display the month using Scanner and Switch statement.

case: 1 will display January

case: 12 will display December

Anything outside of 12 will display "Invalid"
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		 Scanner scan=new Scanner(System.in);
		    System.out.print("Input a number between 1-12");
		    int num1=scan.nextInt();
		    
		    switch (num1) {
		      
		    case 1: num1=1;
		    System.out.println("January");
		    break;
		    case 12: num1=2;
		    System.out.println("December");
		    break;
		    default:
		    	System.out.println("Invalid");
		    }
		    
		    
		    
		  }

	}
