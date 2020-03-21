package com.syntax.class13;

public class Recap2DArray {

	public static void main(String[] args) {
		// 1st way
		int[][] numbers= new int[3][4]; //3 rows 4 columns
		//Let's print  third element in second row
		System.out.println("Third element is second row "+numbers[1][2]);
		
		//initialize values for 1st row= row index 1..........below is second row
		numbers[1][0]=9;
		numbers[1][1]=6;
		numbers[1][2]=2;
		numbers[1][3]=8;
		
		System.out.println("Third element in second row is "+numbers[1][2]);
		//initialize values for first row = row index 0
		numbers[0][0]=7;
		numbers[0][1]=1;
		numbers[0][2]=6;
		numbers[0][3]=12;
		
		//initialize value in third row= row index 2
		numbers[2][0]=3;
		numbers[2][1]=0;
		numbers[2][2]=8;
		numbers[2][3]=5;
		
		//2nd Way
		int[][] numbers2 = {{7,1,6,12},{9,6,2,8},{3,0,8,5}};
		//print 4th element in first row
		System.out.println("Third element in second row is "+numbers2[0][3]);
		int row= numbers2.length; //numbers.length will give how many rows there are
		System.out.println("row = " + row);
		
		int length0=numbers2[0].length;
		int length1=numbers2[1].length;
		int length2=numbers2[2].length;
		
		System.out.println("row0 = "+length0+ " : row1 = "+length1+" : row2 = "+length2);
		
		
		//3rd Way, the coolest way..............................
		int[][] numbers3= new int[3][];
		numbers3[0]= new int[4];
		numbers3[1]= new int[4];
		numbers3[2]= new int[4];
		
		System.out.println();

	}

}
