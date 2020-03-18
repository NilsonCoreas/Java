package com.syntax.class06;

import java.util.Scanner;

public class Repl37 {

	public static void main(String[] args) {
		/*Take 2 boolean inputs from a user:
 
"Are you thirsty?"
"Are you sleepy?"

If user is thirsty and not sleepy--> drink=Water
If user is thirsty and sleepy--> drink=Coffee
If user is not thirsty and sleepy --> drink=Tea
Otherwise drink="Nothing"
		 * System.out.print("Are you above 18?");
          Scanner scanner = new Scanner(System.in);
          if(scanner.nextBoolean()==true)
           //do stuff

          }else{

          //do stuff
   * 
		 */

	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("Are you thirsty?");
	    boolean a=scan.nextBoolean();								//String ques1=scan.nextLine();
	    System.out.println("Are you sleepy?");
	    boolean b=scan.nextBoolean();
	    boolean x = true;
	    boolean y = false;
	    if (x || y) {
	    System.out.println(true);
	    } else {
	    System.out.println(false);
	    }
	    
	   
	    
	    
	    
	   

	}

}
