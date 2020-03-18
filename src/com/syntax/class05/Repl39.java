package com.syntax.class05;

import java.util.Scanner;

public class Repl39 {

	public static void main(String[] args) {
		/*A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade
		 * 
		 * 
		 * 
		 */
		Scanner scan;
		  int grade;
		  scan=new Scanner(System.in);
		  System.out.println("Please enter your mark");
		  grade=scan.nextInt();
		  char finalMark = 0;
		  
		  if(grade>=1 && grade<25) {
			  finalMark='F';
		  }else if(grade>25 && grade<45) {
			  finalMark='E';
		  }else if(grade>45 && grade<50) {
			  finalMark='D';
		  }else if(grade>50 && grade<60) {
			  finalMark='C';
		  }else if(grade>60 && grade<80) {
			  finalMark='B';
		  }else if(grade>80) {
			  finalMark='A';
		  }else 
			  System.out.println("Please enter valid mark");
		  System.out.println("Your grade is " + finalMark);
	}
	
}
