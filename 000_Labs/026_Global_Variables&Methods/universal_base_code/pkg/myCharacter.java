/*
 *	Author:  Isaac Lee
 *  Date:	10/18/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role; 
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public myCharacter() {
		role = "No role";
		strength = 0; 
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public myCharacter(String r) {
		role = r;
		strength = 0; 
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public static void myToString() {
		System.out.println("your role is " + role);
		System.out.println("your strength trait is " + strength);
		System.out.println("your intelligence trait is " + intelligence);
		System.out.println("your charisma trait is " + charisma);
		System.out.println("your dexterity trait is " + dexterity);
	}
	
	
}

