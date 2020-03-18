package com.syntax.class08;

public class LoopWhileAndDoWhileTask {

	public static void main(String[] args) {
		//Add even numbers
		//Also add Odd numbers
		//Between 1 - 50
		//Using while loop or do while
		//can use mod operator of add by 2
		/*int evenSum=0;
		int oddsSum=0;
		for (int i=1;i<=50;i++) {
			if  (i%2==0) {
				evenSum=evenSum+i;
			}else {
				oddsSum=oddsSum+i;
			}
		}
	System.out.println("Sum of evens "+ evenSum);
	System.out.println("Sum of odds "+ oddsSum);
	}
} */
		int count=1;
		int oddSum= 0, evenSum= 0;
		
		//1st way
		while(count <= 50) {
			if(count%2==0) { //%=remainder modulo
				evenSum += count;
			}else {
				oddSum+=count;
			}
			count++; //reassigned
		}
		System.out.println("evenSum is = " +evenSum);
		System.out.println("evenOdd is = " +oddSum);
		
		System.out.println("Using Do While");
		//second way, this only adds odd numbers
		count=1; 
		oddSum=0; //reassigned
		do { //will loop 25 times since adding by 2
			oddSum += count;
			count +=2;
		}while (count <= 50);
}
}