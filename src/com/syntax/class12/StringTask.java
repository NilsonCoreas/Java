package com.syntax.class12;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		String str = "Sunday";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.print("Reversed string is:");
		System.out.println(reverse);
		
		System.out.println("------Task 2-------");
		//Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		//Write a program that reads two people’s first names and if they expecting boy or girl?
		//Based on the input suggests a name for a baby:
		//Example Output:
		//Mom’s first name? Mary
		//Dad’s first name? Daniel
		//Boy or Girl? boy
		//Suggested baby name: DANRY

		//Example Output:
		//Mom’s first name? Mary
		//Dad’s first name? Daniel
		//Boy or Girl? girl
		//Suggested baby name: MAIEL

		//Collapse
		Scanner scan=new Scanner(System.in);
		System.out.println("Input your string:");
		String mid=scan.nextLine();
		int length=mid.length();
		if (length%2!=0) {
			char x=mid.charAt(length/2);
			System.out.println(x);
		}
		System.out.println("----Task 3----");
		System.out.println("Mom's first name?");
		String mom=scan.nextLine();
		System.out.println("Dad's first name?");
		String dad=scan.nextLine();
		System.out.println("Boy or Girl?");
		String gen=scan.nextLine();
		if (gen.contentEquals("Boy")) {
			String partDad=dad.substring(0, 3);
			String partMom=mom.substring(3);
			String name=partDad+partMom;
			System.out.println("Suggested baby name: "+name);
		}else if (gen.contentEquals("Girl")) {
			String partDad=dad.substring(3);
			String partMom=mom.substring(0, 3);
			String name=partMom+partDad;
			System.out.println("Suggested baby name: "+name);
		}



	}
}
