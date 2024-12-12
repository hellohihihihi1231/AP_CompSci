/*
	Author: Isaac Lee
	Date: 12/5/24
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word or phrase:");
		String phrase = in.nextLine();
		System.out.println("Your word/phrase as sPoNgE cAsE:");
		while(true) {
			if(phrase.indexOf(" ") == -1) {
				System.out.print(spongeCase(phrase));
				break;
			}
			int space = phrase.indexOf(" ");
			String word = phrase.substring(0, space);
			System.out.print(spongeCase(word) + " ");
			phrase = phrase.substring(space+1);
		}
	}
	
	public static String spongeCase(String word) {
		String result = "";
		for(int i = 0; i < word.length(); i ++) {
			String letter = word.substring(i, i+1);
			if(i % 2 == 0) {
				letter = letter.toLowerCase();
			}
			else {
				letter = letter.toUpperCase();
			}
			result += letter;
		}
		return result;
	}
}
