/*
 *	Author: Isaac Lee
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number: "); 
		int num1 = in.nextInt();
		System.out.println("enter another number: ");
		int num2 = in.nextInt();
		if(num1 == num2) { 
			System.out.println("the numbers are equal");
		}
		else if (num1 != num2) { 
			System.out.println("the numbers are different");
		}
	}
}
