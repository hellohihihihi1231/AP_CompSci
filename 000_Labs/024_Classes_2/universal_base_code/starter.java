/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter chara = new myCharacter();
		System.out.println("your role is " + chara.role);
		System.out.println("your strength trait is " + chara.strength);
		System.out.println("your dexterity trait is " + chara.dexterity);
		System.out.println("your intelligence trait is " + chara.intelligence);
		System.out.println("your charisma trait is " + chara.charisma);
	}
}
