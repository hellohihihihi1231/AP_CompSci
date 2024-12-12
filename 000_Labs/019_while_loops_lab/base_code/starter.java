/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner in = new Scanner(System.in);
		int counter = 0;
		System.out.println("enter your name");
		String name = in.nextLine();
		System.out.println("how many times do you want the name to be printed?");
		int amount = in.nextInt();
		
		while(counter < amount) {
			System.out.println(name);
			counter ++;
		}


		
	}
}
