package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		//hello 5 times
		
		int num=1;
		while(num<=5) {
			System.out.println("Hello");
			num++;
		}
		
		System.out.println("-----USING DO WHILE LOOP------");
		//say hello 5 times
				int num1=1; //it will always execute it once, unless the condition is true then it will execute it whatever number you put in codition
				//ex. if i put 11 instead, then it will execute once, if still 1 then will execute 5 times
				
				do {	//condition is checked after SOPln
					System.out.println("Hello");
					num1++;
				}while(num1<=5);

	}

}
/*

 * 
 *  int i=20;
    do {
      System.out.println(i);
      i-=2;
    }while(i>=1);
  }
  
}
*/
