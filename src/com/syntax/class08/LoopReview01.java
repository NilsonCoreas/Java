package com.syntax.class08;

public class LoopReview01 {

	public static void main(String[] args) {
		String greeting = "Hello";
		int count = 1;
		//boolean codition = (count<=5)
		while (count <= 5) {
			//	count= count +1;
			//	count +=1;
				count++;
			System.out.println(greeting);
		}
		//reassigning count to 1
		count = 1;
		while (true) {
			count++;
			System.out.println(greeting);	//will print out 5 times, started at 1 and increased 
			if (count==6 ) {
				break;
			}
			//count++; will print out 6 times since after break or whatever number you put 
		}

	}

}
