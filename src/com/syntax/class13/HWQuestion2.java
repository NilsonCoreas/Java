package com.syntax.class13;

public class HWQuestion2 {

	public static void main(String[] args) {
		// / Write a java program to check whether a given number is prime or not?
		//prime number is a number that is greater than 1
		//prime number should meet 2 coditions(divisble by 1 and itself only
		
		int given=8;
		boolean isPrime=true;
		
		if(given>1) {
			
			for(int i=2; i<given; i++) {
				if(given%1==0) {
					isPrime=false;
					break;
				}
			}
			
		}else {
			isPrime=false;
		}
		System.out.println("Given number "+given+" is prime? " + isPrime);
	}

}
