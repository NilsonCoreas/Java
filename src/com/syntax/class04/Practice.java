package com.syntax.class04;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    
		  System.out.println("Enter your name");
		  String name= scan.next();
		  System.out.println("Enter your mobile numer");
		  String mobile=scan.next();
		  System.out.println("Enter your age");
		  int age=scan.nextInt();
		  System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + mobile);
		  }
		   
		}
//Your name is Weqas, your age is 45 and your mobile number is 571-339-9999