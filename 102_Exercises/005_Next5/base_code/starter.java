/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = in.nextInt();
		System.out.println("here are the next 5 numbers");
		System.out.println(num + ", " + (num+1) + ", " + (num+2) + ", " + (num+3) + ", " + (num+4 ) + ", " + (num+5));
		System.out.println("here are the next 5 multiples of " + num);
		System.out.println(num + ", " + (num*2) + ", " + (num*3) + ", " + (num*4) + ", " + (num*5) + ", " + (num*6));
		System.out.println("here is " + num + " divided by 100");
		System.out.println(num/100.0);
		System.out.println("here is " + num + " divided by 10");
		System.out.println(num/10.0);
	}
}
