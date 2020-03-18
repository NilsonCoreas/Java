package com.syntax.class07;

import java.util.Scanner;

public class LoopTask3 {

	public static void main(String[] args) {
		//we are playing a lottery and a lucky numer is 17;
		//we want to keep asking user any number from 1-20
		//until he guess the lucky number --> congrats
		
		Scanner scan;
		int number=1;
		int luckyNum=17;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please enter any number from 1 to 20");
			number=scan.nextInt();
		}while(number!=luckyNum); //condition turns into false once 17 is input so it prints out line below
		System.out.println("You got it");
	}

}
