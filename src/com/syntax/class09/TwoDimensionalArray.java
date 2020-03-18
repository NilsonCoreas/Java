package com.syntax.class09;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] numbers=new int[3][4]; //always have to specify [rows][columns]
		//[] <-- rows columns --> []
		//1st row
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		//2nd row
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		//3rd row
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
		
		//print value 15
		System.out.println(numbers[1][2]); //2nd row 3rd column
		
		System.out.println("-----SHORTER WAY-----");
		//creating 2D array using 2nd way
		int[][] nums= {{10, 20, 30, 40}, //array of 3 single dimensional arrays
						{5, 10, 15, 20}, 
						{1, 2, 3, 4}
						};
		System.out.println(nums[2][3]); //storing 4, [row 2][column 3]
		System.out.println(nums[0][2]); //storing 30 [row 0][column 2]
		
		System.out.println("------------------");
		
		String[][] month= {{"Jan", "Feb", "Dec"}, 
							{"March", "April", "May"}, 
							{"June", "July", "August"}, 
							{"Sep", "Oct", "Nov"}
							};
		
		int rows=month.length;
		int firstArray=month[0].length;
		System.out.println(firstArray);
		
		for(int i=0; i<month.length; i++) {
			
			for(int j=0; j<month[i].length; j++) {
				
				System.out.println(month[i][j]);
			}
		}
		
	}

}
