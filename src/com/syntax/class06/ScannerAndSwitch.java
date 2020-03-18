package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		/*Ask user a gender: M or F char
		 * based on the gender we will provide the desciption
		 * 
		 * 
		 * 
		 */
		Scanner scan;
		char gender;
		String genderType;
		
		scan=new Scanner(System.in);
		System.out.println("What is your gender, M or F?");
		gender=scan.next().charAt(0);	//must use this to save the output then proceed
		
		switch(gender) { 			//gender is the char
		
		case 'M':
			genderType="Male";		//genderType is teh String 
			break;
		case 'F':
			genderType="Female";
			break;
		default:
			genderType="Unknown";
		
		}
		
		System.out.println("Your gender is " + genderType);
		
	}

}
