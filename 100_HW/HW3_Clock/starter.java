/*
 *	Author: Isaac Lee
 *  Date: 9/19/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter what day it is (0-6):");
		int day = in.nextInt();
		if (day == 0 || day == 6) {
			System.out.println("It's the weekend! It's 10AM!");	
		}
		else {
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		}		
	}
}
