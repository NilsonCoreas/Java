package com.syntax.class09;

public class MorePatterns {
	// *
	// **
	// ***
	public static void main(String[] args) {
		for (int r = 1; r <= 4; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*"); // deleted ln to make sure the row is full
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(c+ ""); 
			}
			System.out.println();
		}
		System.out.println("-----------");
		//Print pattern
		//55555
		//44444
		//333
		//22
		//1
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("------------");
		// print pattern
		//*
		//**
		//***
		//**
		//*
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}
