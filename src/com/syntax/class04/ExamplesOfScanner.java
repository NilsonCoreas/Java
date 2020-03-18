package com.syntax.class04;

import java.util.Scanner;

public class ExamplesOfScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any text");
		
		String text=scan.hasNextLine();
		System.out.println(text);
		
		System.out.println("Please enter any number");
		int number=scan.hasNextInt();
		System.out.println(numer);
		
		System.out.println("End of the program");

	}

}
