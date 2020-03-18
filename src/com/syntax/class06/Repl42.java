package com.syntax.class06;

import java.util.Scanner;

public class Repl42 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter the roll number of the Child");
		 int rollNumber=scan.nextInt();
		 
		 switch (rollNumber) {
		   
		   case 101: rollNumber=101;
		   System.out.println("Ramesh");
		   break;
		   case 102: rollNumber=102;
		   System.out.println("Mahesh");
		   break;
		   case 103: rollNumber=103;
		   System.out.println("Mukesh");
		   break;
		   default:
		   System.out.println("Not found Student name: in Class");
		 }
		}
	}


