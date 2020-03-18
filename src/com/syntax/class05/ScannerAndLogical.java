package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*You are a salesman
		 * Ask a user for how much his sales are
		 * based on the amount of sales we need to calculate commission
		 *If sales is between $1 and $100 --> commission should be 10%
		 *if sales is between $100 and $200 --> commission should be 20%
		 *if sales is bwteen $200 and $200 --> commission should be 30%
		 *if sales is more than $500 --> commission should be 50%
		 */
		//1. delcare all variables that I will need
		Scanner scan;
		double sales;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		
		sales=scan.nextDouble();
		
		if(sales>=1 && sales<=100) {
		//give user 10% commission	
		commission=sales*0.10;	
		}else if (sales>100 && sales<=200) {
			//give user 20% commission
		commission=sales*0.2;
		}else if (sales>200 && sales<=500) {
			//give user 30% commission
		commission=sales*0.3;
		}else {
			commission=sales*0.5;
		}
		System.out.println("Based on yoru sales your commision is =" + commission);
		if(commission>100) { //used this to print out line below
			System.out.println("You are an awesome seller");
		}
	System.out.println("---------------------------");
	// Write a program that will read three inputs of scores (quiz, mid term,
	// and final scores) and determine the grade based on the following rules:
	// -if the average score >=90 → grade=A.
	// -if the average score >= 70 and <90 → grade=B.
	// -if the average score>=50 and <70 → grade=C.
	// -if the average score<50 → grade=F
	Scanner variable = new Scanner(System.in);		
	System.out.println("Enter your quiz score");
	int quiz = scan.nextInt();	
	System.out.println("Enter your mid term score");
	int midTerm = scan.nextInt();
	System.out.println("Enter your final score");
	int finalScore = scan.nextInt();
	double average = quiz=midTerm=finalScore;
	String score =scan.nextLine();	
	if (average>=90) {
		score="'A'";
	}else if (average >=70 && average >=90) {
		score="'B'";
	}else if (average >=50 && average >=70) {
		score="'C'";
	}else {
		score="'F'";
	}
	System.out.println("Your average grade is "+score);
System.out.println("----------------------");
Scanner input = new Scanner(System.in);
System.out.println("Please enter your birth month:");
int month=scan.nextInt();
String season=null;	
if(month.equals("January") || month==12 || month==1 || month==2) {
	season=("Winter");
}else if (month==3 || month==4 || month==5){
	season=("Spring");
}else if (month==6 || month==7 || month==8) {
	season=("Summer");		
}else if (month==9 || month==10) {
	season=("Fall");
}else {
	season="Unknown";
	System.out.println("Please enter valid month");
}
System.out.println("You were born in the "+ season);
}
}
