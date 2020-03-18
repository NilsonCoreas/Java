package com.syntax.class09;

public class Patterns {
	//rows= outer loop columns= inner loop
	public static void main(String[] args) {
		//printing patterns using nested loop, prints out 4 rows and 5 columns of stars
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------"); //will print 12345 in several lines
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) { //changes the middle number to make the row 1-9
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("------------");
		//54321 5 rows
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=1; j--) {
				System.out.print(j); //controls columns
			}
			System.out.println();
		}
		System.out.println("-------------");
		//print 5 rows of 5s,4s,3s,2s,1s
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
