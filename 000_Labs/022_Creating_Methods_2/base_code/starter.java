/*
 *	Author:  Isaac Lee
 *  Date: 10/8/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter a base number: ");
		int x = in.nextInt();
		System.out.print("enter exponent number: ");
		int y = in.nextInt();
		int answer = pow(x,y);
		System.out.println("your answer is: " + answer); 
	}
	
	public static int pow(int x, int y) {
		int answer = 1;
		for(int i = 0; i < y; i++) {
			answer *= x;
		}
		return answer;
	}
}
