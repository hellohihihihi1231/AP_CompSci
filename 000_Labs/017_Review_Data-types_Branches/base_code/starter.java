/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int points = 20;
		System.out.println("what is your name?");
		String name = in.nextLine();
		System.out.println("what is your title? ex: slayer of dragons");
		String title = in.nextLine();
		System.out.println("would you like to be a wizard, warrior, or rogue?");
		String role = in.nextLine();
		if(!(role.equalsIgnoreCase("wizard") && role.equalsIgnoreCase("warrior") && role.equalsIgnoreCase("rogue"))) {
			System.out.println("you have not chosen a role. rerun program");
		}
		else {
			System.out.println("you've chosen the " + role + "! excelsior!\n");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.\n");
		System.out.println("strength (1-10)");
		int strength = in.nextInt();
		if(strength > 10 || strength > points) {
			System.out.println("please input a smaller value. strength (1-10)");
			strength = in.nextInt();
		}
		points -= strength;
		System.out.println("you have " + points + " left to spend");
		
		System.out.println("dexterity (1-10)");
		int dexterity = in.nextInt();
		if(dexterity > 10 || dexterity > points) {
			System.out.println("please input a smaller value. dexterity (1-10)");
			dexterity = in.nextInt();
		}
		points -= dexterity;
		System.out.println("you have " + points + " left to spend");
		
		System.out.println("intelligence (1-10)");
		int intelligence = in.nextInt();
		if(intelligence > 10 || intelligence > points) {
			System.out.println("please input a smaller value. intelligence (1-10)");
			intelligence = in.nextInt();
		}
		points -= intelligence;
		System.out.println("you have " + points + " left to spend");
		
		System.out.println("charisma (1-10)");
		int charisma = in.nextInt();
		if(charisma > 10 || charisma > points) {
			System.out.println("please input a smaller value. charisma (1-10)");
			charisma = in.nextInt();
		}
		points -= charisma;
		System.out.println("you have " + points + " left to spend");
		
		System.out.println("-----------------------------------------------------");
		System.out.println("you are " + name + ", the " + title + " of CVHS");
		System.out.println("you're a " + role + " with the following stats");
		System.out.println("strength - " + strength);
		System.out.println("dexterity - " + dexterity);
		System.out.println("intelligence - " + intelligence);
		System.out.println("charisma - " + charisma);
	}
}
