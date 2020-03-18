package com.syntax.class08;

public class LoopsHW {

	public static void main(String[] args) {
		//print number from 501 to 1
		for(int i=50; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("---PRINTING ODD NUMBERS----");
		//print numbers between 20 and 50
		for(int i=20; i<=50; i++) {
			if(i%2!=0 ) {
				System.out.println(i);
			}
		}
		for(int i=21; i<50; i+=2) {	//also used for odd numbers
			System.out.println(i);
		}
		//what is the output
		int total=2;
		for(int k=1; k<4; k++ ) { //k++=2+1
			total=total*k; //2 times 1=2*2=4*3=12
			System.out.println(total);
		}
		System.out.println(total);
		
		//write a program to calculate sum of odds and sum of even numbers
		//1 to 99
		int evensSum=0;
		int oddsSum=0;
		for(int a=1; a<=99; a++) {
			if(a%2==0) { //change it to =0 and will output odd numbers
				evensSum=evensSum+a;
			} {
				oddsSum=oddsSum+a;
				System.out.println("sum of evens " +evensSum);
				System.out.println("sums of odds " +oddsSum);
			}
			
		}
	}

}
