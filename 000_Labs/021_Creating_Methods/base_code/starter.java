/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("write a sentence");
		String string1 = in.nextLine();
		System.out.println("write another sentence");
		String string2 = in.nextLine();
		toString(string1);
		toStringCombined(string1, string2);
	}
	
	public static void toString(String phrase1) {
		System.out.println(phrase1);
	}
	public static void toStringCombined(String phrase1, String phrase2) {
		System.out.println(phrase1 + " " + phrase2);
	}
}
