package com.syntax.class15;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	  Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    String str=null;
	    char[] charArray= str.toCharArray();
	    for (int i = charArray.length; i<=0; i++) {
				System.out.println(charArray[i]); 
	    }
	}
	}