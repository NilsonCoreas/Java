package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
/*
        for(int i=1; i<=3; i++){ 
            for(int y=3; y<=3; y++){
                System.out.println(i+" "+y);
            }
        }
    }
}

 * 
 */
		for (int i = 1; i <= 3; i++) {
			System.out.println("hello");

			for (int y = 1; y <= 3; y++) {
				System.out.println("Bye");
			}
		}

	}

}
