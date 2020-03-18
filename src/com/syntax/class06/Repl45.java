package com.syntax.class06;

import java.util.Scanner;

public class Repl45 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number between 1-7");
		int day=scan.nextInt();
		
		switch (day) {
		
		case 1: day=1;
		System.out.println("Sunday");
		break;
		
		case 2: day=2;
		System.out.println("Monday");
		break;
		
		case 3: day=3;
		System.out.println("Tuesday");
		break;
		
		case 4: day=4;
		System.out.println("Wednesday");
		break;
		
		case 5: day=5;
		System.out.println("Thursday");
		break;
		
		case 6: day=6;
		System.out.println("Friday");
		break;
		
		case 7: day=7;
		System.out.println("Saturday");
		break;
		
		default:
		System.out.println("Unknown");
		
		}

	}

}
