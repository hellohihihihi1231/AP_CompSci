/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("would you like to be a wizard, warrior, or rogue");
		String role = in.nextLine();
		if(role.equalsIgnoreCase("wizard")) {
			System.out.println("you are a " + role);
		}
		else if(role.equalsIgnoreCase("warrior")) {
			System.out.println("you are a " + role);
		}
		else if(role.equalsIgnoreCase("rogue")) {
			System.out.println("you are a " + role);
		}
		else {
			System.out.println("you did not enter one of the three roles");
		}
	}
}
