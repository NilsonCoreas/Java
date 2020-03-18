package com.syntax.class06;

import java.util.Scanner;

public class SwitchTasks {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it.
		 *  Once values are captured print which language user speaks.
		 * 
		 * 
		 */
		Scanner scan;
		String country;
		String language;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		
		switch(country) {
		
		case "USA": 
			language="english";
			break;
		case "Japan": 
			language="japanese";
			break;
		case "Mexico":
			language="spanish";
			break;
		default:
			language="unknown";
		
		}
		System.out.println("Your language is " + language);
		
		System.out.println("-------------NEXT TASK--------------");
		
		/*Allow user to enter grade and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		 *   At the end your program should print which grade was entered by a user with explanation.
		 * 
		 */
		Scanner input;
		char grade;
		String gradeScale;
		
		scan.nextLine();
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
		System.out.println("You did" + gradeScale);
		
		
		
	}

}
