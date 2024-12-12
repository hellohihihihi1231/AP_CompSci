/*
 *	Author:  isaac lee
 *  Date: 10/24/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		myCharacter char1 = new myCharacter();
		char1.myToString();
		System.out.println("------------------------------------------------");
		System.out.println("what class would you like to be?");
		String role = in.nextLine();
		myCharacter char2 = new myCharacter();
		char2.setAll(role, -2, 10, 5, 0, 3);
		char2.myToString();
		


		
	}
}
