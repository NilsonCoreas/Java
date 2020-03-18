package com.syntax.class05;

import java.util.Scanner;

public class Repl38 {

	public static void main(String[] args) {
		/*Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
"Today you will be learning ____"
		 * 
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Is it weekend?");
		String day=scan.nextLine();
		
		if(day.equals("Monday")) {
			System.out.println("Java");
		}
		
		
	}

}
