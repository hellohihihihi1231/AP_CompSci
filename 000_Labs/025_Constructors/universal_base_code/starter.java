/*
 *	Author: Isaac Lee 
 *  Date: 10/18/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		myCharacter a = new myCharacter();
		System.out.println("your role is " + a.role);
		System.out.print("What class would you like to be?");
		String role = in.nextLine();
		if(role.equalsIgnoreCase("warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (role.equalsIgnoreCase("wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if (role.equalsIgnoreCase("rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else {
			System.out.println("You've decided not to chose a role. Rerun program.");
			role = "No role";
		}
		
		myCharacter b = new myCharacter(role);
		System.out.println("your role is " + b.role);
	}
}
