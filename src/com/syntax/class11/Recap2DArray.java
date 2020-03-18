package com.syntax.class11;

public class Recap2DArray {

	public static void main(String[] args) {
		String[][] groceries={{"cucumber", "potato", "carrot"}, 
				{"mango", "apple", "banana", "kiwi"},
				{"milk", "cheese", "yougrt"}
				};
		System.out.println(groceries[1][2]);
		//get all values from 2D array
		for(int r=0; r<groceries.length; r++) {
			for(int c=0; c<groceries[r].length; c++) {
				System.out.println(groceries[r][c]+ " ");
			}
		}
		System.out.println("---GETTING ELEMENTS USING ADVANCED FOR LOOP----");
		
		for(String[] array:groceries) {
			
			for(String items:array) {
				System.out.println(items+" ");
			}
			System.out.println();
		}
	}

}
