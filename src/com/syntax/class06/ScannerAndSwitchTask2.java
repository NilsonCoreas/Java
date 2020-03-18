package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitchTask2 {

	public static void main(String[] args) {
		Scanner scan = null;
		char grade;
		String gradeScale;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grade=scan.next().charAt(0); //gender=scan.next().charAt(0);
		
		switch(grade) {
		
		case 'A': 
			gradeScale="Excellent";
			break;
		case 'B':
			gradeScale="Good";
			break;
		case 'C':
			gradeScale="Average";
			break;
		case 'D':
			gradeScale="Bad";
			break;
		default:
			gradeScale= "Not Acceptable";
	
		}
		System.out.println("You did " + gradeScale);
		
		
		
	}



	}


