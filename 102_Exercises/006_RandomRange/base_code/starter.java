/*
 *	Author: Isaac Lee
 *  Date: 9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 number to create a range for your random number");
		System.out.println("Please enter an integer: ");
		int startValue = in.nextInt();
		in.nextLine();
		System.out.println("Please enter another integer (bigger than the first): ");
		int endValue = in.nextInt();
		System.out.println("Your range is " + startValue + " to " + endValue);
		System.out.println("Here are 5 numbers generated in that range");
		int num1 = (int)(Math.random()*(endValue-startValue)) + startValue;
		int num2 = (int)(Math.random()*(endValue-startValue)) + startValue;
		int num3 = (int)(Math.random()*(endValue-startValue)) + startValue;
		int num4 = (int)(Math.random()*(endValue-startValue)) + startValue;
		int num5 = (int)(Math.random()*(endValue-startValue)) + startValue;
		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
	}
}
