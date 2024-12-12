/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = (int)(Math.random() * 1001) + 1;
		System.out.println("enter a number between 1-1000");
		int guess = in.nextInt();
		if(guess == num) {
			System.out.println("correct");
		}
		else {
			System.out.println("incorrect, the correct number was " + num);
		}
	}
}
