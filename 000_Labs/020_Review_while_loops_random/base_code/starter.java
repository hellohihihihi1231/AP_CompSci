/*
 *	Author:  Isaac Lee
 *  Date: 10/3/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int secretnum = (int)(Math.random()*1000)+1;
		while(true) {
			System.out.print("Guess a number (1-1000): ");
			int guess = in.nextInt();
			if(guess == secretnum) {
				System.out.println("You guessed it!");
				break;
			}
			else if(guess < secretnum) {
				System.out.println("You are too low\n");
			}
			else if(guess > secretnum) {
				System.out.println("You are too high\n");	
			}
		}


		
	}
}
