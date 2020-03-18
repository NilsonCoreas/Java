package com.syntax.class09;

import java.util.Scanner;

public class Repl76 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] date = new String[7];
		System.out.println("Please enter day 1 of the week");
		String day = scan.nextLine();
		System.out.println(day);

		for (int count = 0; count <= 7; count++) {
			System.out.println("Please enter day 2 of the week");
			String day1 = scan.nextLine();
			System.out.println(day1);
			
		}
		for (int count = 0; count <= 7; count++) {
			System.out.println("Please enter day 3 of the week");
			String day2 = scan.nextLine();
			System.out.println(day2);
	}
		for (int count = 0; count <= 7; count++) {
			System.out.println("Please enter day 4 of the week");
			String day3 = scan.nextLine();
			System.out.println(day3);
	}
}
}