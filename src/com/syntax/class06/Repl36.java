package com.syntax.class06;

import java.util.Scanner;

public class Repl36 {

	public static void main(String[] args) {
		/*
		 * Prompt user to input two strings : "Please enter two strings"and two
		 * integers: "Please enter two numbers" and make the comparisons: if int1 and
		 * int2 are equal and word1 and word2 are equal, output "AND" if int1 and int2
		 * are equal or word1 and word2 are equal, output "OR" if int1 and int2 are not
		 * equal and word1 and word2 are not equal, output "NONE"
		 *
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two ");
		
		boolean num1 = scan.nextBoolean();
		boolean num2 = scan.nextBoolean();

		if (num1 == num2 && word1.equals(word2)) {
			output = "AND";
			System.out.println(output);
		} else if(num1 == num2 || word1.equals(word2)) {
			output = "OR";
			System.out.println(output);
		} else if(!(num1 == num2) && !(word1.equals(word2))) {	
		output = "NONE";
		System.out.println(output);
	}
	}
}