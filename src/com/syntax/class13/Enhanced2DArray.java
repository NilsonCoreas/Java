package com.syntax.class13;

public class Enhanced2DArray {

	public static void main(String[] args) {
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		//iteratingrows of a 2D array
		for (int[] row : num) {
			//iterating elements of a row
			for(int element:row) {
				System.out.print(element + " ");
				
			}
			System.out.println(); //use this to seperate all 3 rows
		}

	}

}
