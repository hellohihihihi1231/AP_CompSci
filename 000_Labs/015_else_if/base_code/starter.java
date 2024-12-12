/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = (int)(Math.random()*1001)+1;
		System.out.println("guess a number 1-1000");
		int guess = in.nextInt();
		if(guess == num) {
			System.out.println("correct");
		}
		else if (guess > num) {
			System.out.println("your guess is higher than the answer");
		}
		else if (guess < num) {
			System.out.println("your guess is lower than the answer");
		}
	}
}
