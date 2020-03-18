package com.syntax.class08;

public class LoopTask03 {
 public static void main(String[] args) {
	//print numbers from 15 -35
	//but don't print number that are divisible by both 2 and 3
	for (int i=15; i<=35; i++) { //can use i<36, same thing
		//1st way, divisible by 6
		if (i%6==0) {	//results will show each number cannot be divided by 2 and 3, possibly just 1 of them tho
			continue;
		}
		System.out.println(i);
		
		//2nd way, using &&
		if (i %2==0 && i%3==0) {
			continue;
		}
		System.out.println(i);
		//using OR ||
		if(i%2!=0 || i%3!=0) {
			System.out.println(i);
		}
	}
}
}
