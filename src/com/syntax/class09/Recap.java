package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		//using nested loop to print 10-99
		for(int i=1; i<=9; i++) {
			for(int y=0; y<=9; y++) {
				System.out.println(i + "" + y );
			}
		}
		System.out.println("--------------------");
		
		//military clock 
		for(int h=0; h<=24; h++) {
			for(int m=0; m<=60; m++) {
				if(m<10) { //added this to put :0 in front of every single digit number
					System.out.println(h+":0" +m);
				}else {
				System.out.println(h+""+m);
				}
			}
		}
		System.out.println("--------------------");
		// odometer
		for (int i=0; i< 10; i++) {
			for (int k=0; k<10; k++) {
				for (int z=0; z<10; z++) {
					for (int j=0; j<10; j++) {
						System.out.println(i+ "" + k + "" + z + "" + j);
					}
				}
			}
		}
	}

}
