/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = in.nextInt();
		System.out.println("enter a second number");
		int num2 = in.nextInt();
		System.out.println("enter a third number");
		int num3 = in.nextInt();
		if(num1 > num2 && num1 > num3) {
			System.out.println("largest number is " + num1);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("largest number is " + num2);
		}
		else if(num3 > num2 && num3 > num1) {
			System.out.println("largest number is " + num3);
		}
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("smallest number is " + num1);
		}
		else if(num2 < num1 && num2 < num3) {
			System.out.println("smallest number is " + num2);
		}
		else if(num3 < num1 && num3 < num2) {
			System.out.println("smallest number is " + num3);
		}
	}
}
