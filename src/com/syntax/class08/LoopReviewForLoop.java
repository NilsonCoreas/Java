package com.syntax.class08;

public class LoopReviewForLoop {

	public static void main(String[] args) {
		//Add even numbers
				//Also add Odd numbers
				//Between 1 - 50
				//Using while loop or do while
				//can use mod operator of add by 2
				int evenSum=0;
				int oddSum=0;
			
				for (int i=1;i<=5;i++) {
					if  (i%2==0) { 	//use mod % to do odd and even numbers
						evenSum +=i;
					}else {
						oddSum +=i;
					}
				}
			System.out.println("Sum of evens "+ evenSum);
			System.out.println("Sum of odds "+ oddSum);
			int totalSum=evenSum+oddSum; //1st way to do it 
			System.out.println("Total of odds and evens is " + totalSum);
			
			
			}
		

	}


