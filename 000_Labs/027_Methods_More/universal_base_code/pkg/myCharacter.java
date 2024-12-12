/*
 *	Author:  Isaac Lee
 *  Date:	10/18/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role; 
	public int strength;
	public int dexterity;
	public int intelligence;
	public int charisma;
	public int constitution;
	
	public myCharacter() {
		role = "no role";
		strength = 0; 
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
		constitution = 0;
	}
	
	public myCharacter(String r) {
		role = r;
		strength = 0; 
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
		constitution = 0;
	}
	
	public void myToString() {
		System.out.println("your role is " + role);
		System.out.println("your strength trait is " + strength);
		System.out.println("your intelligence trait is " + intelligence);
		System.out.println("your charisma trait is " + charisma);
		System.out.println("your dexterity trait is " + dexterity);
		System.out.println("your constitution trait is " + constitution);
	}
	
	public String setRole(String role) {
		if(role.equalsIgnoreCase("warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
			this.role = role;
			return this.role;
		}
		else if (role.equalsIgnoreCase("wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
			this.role = role;
			return this.role;
		}
		else if (role.equalsIgnoreCase("rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
			this.role = role;
			return this.role;
		}
		else {
			System.out.println("You've decided not to chose a role. Rerun program.");
			this.role = "no role";
			return this.role;
		}
	}
	
	public int setStrength(int strength) {
		if(strength < 0) {
			this.strength = 0;
			return 0;
		}
		else {
			this.strength = strength;
			return this.strength;
		}
	}
	
	public int setDexterity(int dexterity) {
		if(dexterity < 0) {
			this.dexterity = 0;
			return 0;
		}
		else {
			this.dexterity = dexterity;
			return dexterity;
		}
	}
	
	public int setIntelligence(int intelligence) {
		if(intelligence < 0) {
			this.intelligence = 0;
			return 0;
		}
		else {
			this.intelligence = intelligence;
			return this.intelligence;
		}
	}
	
	public int setCharisma(int charisma) {
		if(charisma < 0) {
			this.charisma = 0;
			return 0;
		}
		else {
			this.charisma = charisma;
			return this.charisma;
		}
	}
	
	public int setConstitution(int constitution) {
		if(constitution < 0) {
			this.constitution = 0;
			return 0;
		}
		else {
			this.constitution = constitution;
			return this.constitution;
		}
	}

	public boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma, int constitution) {
		setRole(role);
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setCharisma(charisma);
        setConstitution(constitution);
        return true;
	 }

}

