package com.syntax.class06;

import java.util.Scanner;

public class StudentExample {
	public static void main(String []args) {
		  Scanner Java=new Scanner(System.in);
		  System.out.println("Please enter two strings:");
		  String word1=Java.nextLine();
		  String word2=Java.nextLine();
		  System.out.println("Please enter two numbers");
		  int num1=Java.nextInt();
		  int num2=Java.nextInt();
		  String Output=null;
		  if(num1==num2 && word1==word2){Output="AND";
		  }else if(num1==num2|| word1.equals(word2)){Output="OR";
		  }else if(!(num1==num2) && !(word1==word2)){Output="NONE";}
		  System.out.println(Output);
		}
		
}
