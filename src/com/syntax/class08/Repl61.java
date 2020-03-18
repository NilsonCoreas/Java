package com.syntax.class08;

public class Repl61 {

	public static void main(String[] args) {

        int num = 3;
        for(int i = 1; i <= 10; ++i) //(i * num) + 
        {
        	int total=num*i;
        	System.out.println(num + "*" + i + "=" + total);
            //System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }

	}


