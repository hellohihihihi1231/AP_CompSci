/*
 *	Author:  Isaac Lee
 *  Date: 12/5/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String phrase = in.nextLine();
		String result = "";
		while(true) {
			if(phrase.indexOf(" ") == -1) {
				result = phrase + " " + result;
				break;
			}
			int space = phrase.indexOf(" ");
			String word = phrase.substring(0, space);
			result = word + " " + result;
			phrase = phrase.substring(space+1);
		}
		System.out.println(result);
	}
}
