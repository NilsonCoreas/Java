package com.syntax.class11;

public class Repl81 {

	public static void main(String[] args) {
		 int a[][] = {
					{5,2,3,7},
					{1,5,1,1},
					{8,3,1,2}
				};
		 
		        int max= Integer.MIN_VALUE;
		        for(int i = 0; i < a.length; i++){
		            for(int j = 0; j < a[i].length; j++){
		                if(a[i][j] > max){
		                    max = a[i][j];
		                }
		            }
		            
		        }
		        System.out.println(max);
		    }
		}