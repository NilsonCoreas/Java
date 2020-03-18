package com.syntax.class07;

import java.util.Scanner;

public class LoopAndScanner {

	public static void main(String[] args) {
		
	//Scanner input;
	//String name;
	//int num=1;
	
	//input=new Scanner(System.in);
	//while(num<=5) {	//started here so each SOPln would print 5 times
		//System.out.println("What is your name?");
		
		//name = input.nextLine();
		
	//	System.out.println("Good afternoon " + name);
		
		//num++;
	//}
	//we are playing a lottery and a lucky numer is 17;
	//we want to keep asking user any number from 1-20
	//until he guess the lucky number --> congrats
	Scanner scan;
	int lottery=1;
	
	scan=new Scanner(System.in);
	while(lottery<=20) {
		System.out.println("Congrats");
		lottery++;
	}
	}
}
