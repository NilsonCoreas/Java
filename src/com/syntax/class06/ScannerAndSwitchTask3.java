package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitchTask3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 * REALLY HELPED ME UNDERSTAND SCANNER AND SWITCHnum
		 * 
		 */
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number"); // using line below we are saving the output
		num1 = scan.nextInt();
		System.out.println("Enter an operator (+,-,*,/");
		char operator = scan.next().charAt(0);
		System.out.println("Enter second number"); // " "
		num2 = scan.nextInt();

		

		int finalNumber = 0;
		switch (operator) {

		case '+':
			finalNumber = num1 + num2;
			break;
		case '-':
			finalNumber = num1 - num2;
			break;
		case '*':
			finalNumber = num1 * num2;
			break;
		case '/':
			finalNumber = num1 / num2;
			break;
		default:
			System.out.println("Invalid operator");

		}
		if (finalNumber !=0) {	//to get Invalid Operator
		System.out.println(num1 + " " + operator + " " + num2 + "= " + finalNumber);
		}	//System.out.println("Your results are " + finalNumber); can also type it this way

	}

}
