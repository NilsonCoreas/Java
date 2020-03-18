package com.syntax.class08;

import java.util.Scanner;

public class ScannerAndLoopReview {

	public static void main(String[] args) {
		//Ask the user to enter many positive numbers and add it to the total
		// he should enter -1 to STOP, -1 will not be added to the total
		//1st way
		Scanner input=new Scanner(System.in);
		int total=0;
		System.out.println("Enter a number. To stop enter -1");
		int number = input.nextInt();
		
		while (number !=-1) {
			total +=number;
			System.out.println("Enter a number. To stop enter -1");
			number = input.nextInt();
		}
		System.out.println("The total is =" + total);
		
		//2nd way using Do While
		do {
			System.out.println("Enter a number. To stop enter -1");
			number = input.nextInt();
			if (number ==-1) {
				break;
			}else {
				total +=number;
			}
		}while (number !=-1);
		System.out.println("The total is =" + total);
		//for loop way 
		/*Scanner scan = new Scanner(System.in);
		int num = 0, total = 0;
		for (int i = 1; i >0; i++) {
			System.out.println("Enter a positive num");
			num = scan.nextInt();
			if (num==-1) {
				break;
			}
			total += num;
		}
		System.out.println("total "+total);
	}*/
	}

}
