/*
   * Author: Isaac Lee
   * Date: 12/8/24
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String input = in.nextLine();
		System.out.println("Here's your sentence in Pig Latin!");
		while(true) {
			if(input.indexOf(" ") == -1) {
				System.out.print(pigLatin(input));
				break;
			}
			int space = input.indexOf(" ");
			String word = input.substring(0, space);
			System.out.print(pigLatin(word) + " ");
			input = input.substring(space+1);
		}
	}
	
	public static String pigLatin(String word) {
		String result = "";
		String first = word.substring(0,1);
		String second = "";
		
		if(word.length() > 1) {
			second = word.substring(1,2);
		}
		
		if(word.length() > 1 && (!"aeiou".contains(first) && "aeiou".contains(second))) {
			result = word.substring(1) + "-" + first + "ay";
		}
		else if(word.length() > 1 && (!"aeiou".contains(first) && !"aeiou".contains(second))) {
			result = word.substring(2) + "-" + first + second + "ay";
		}
		else {
			result = word + "-way";
		}
		
		return result;
	}
}