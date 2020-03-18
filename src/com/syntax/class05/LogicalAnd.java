package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/*if declared number is 
		 * between 1-10 --> this numer is small
		 * beyweem 11-100 --> this number is big 
		 * between 101-1000 --> this number is large 
		 */
		int num=78;
		
		if (num>=1 && num<=10) { //left is true and right is false
			System.out.println("This number is small");
		}else if (num>10 && num<=100) { //left is true and right is true
			System.out.println("This number is big");
		}else if (num>100 && num<=1000) { //left is false and right is false
			System.out.println("This is a large number");
		}else {
			System.out.println("Numer is super large");
		}
	}

}
