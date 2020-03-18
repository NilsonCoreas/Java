package com.syntax.class05;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("My name is " + name);

		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("Your name is " + name + " your age is " + age);

		/*
		 * Capture 2 numbers from a user Compare numbers and identify which is larger
		 * 
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter first number");

		int num1 = input.nextInt();

		System.out.println("Please enter a second number");

		int num2 = input.nextInt();

		System.out.println(num1);
		System.out.println(num2);

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num2 == num1) {
			System.out.println(num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
	}

}


	}

}
