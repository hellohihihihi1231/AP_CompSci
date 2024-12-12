/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
class character {
	String role = "wizard";
	int strength = 0;
	int dexterity = 30;
	int intelligence = 100;
	int charisma = 10;
}

class starter {
	public static void main(String args[]) {
		character myCharacter = new character();
		System.out.println("your role is " + myCharacter.role);
		System.out.println("your strength trait is " + myCharacter.strength);
		System.out.println("your dexterity trait is " + myCharacter.dexterity);
		System.out.println("your intelligence trait is " + myCharacter.intelligence);
		System.out.println("your charisma trait is " + myCharacter.charisma);
	}
}
