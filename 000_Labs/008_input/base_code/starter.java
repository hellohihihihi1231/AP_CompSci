/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = in.nextLine();
		System.out.println("how old are you?");
		int age = in.nextInt();
		System.out.println("what is your birthday month?");
		int bdaymonth = in.nextInt();
		System.out.println("what is your birthday day?");
		int bdayday = in.nextInt();
		System.out.println("what is your birthday year?");
		int bdayyear = in.nextInt();
		System.out.println("how much dollars is a buck fifty?");
		int buckfifty = in.nextInt();
		System.out.println("your name is " + name);
		System.out.println("you are " + age + " years old");
		System.out.println("you were born in " + bdaymonth + "/" + bdayday + "/" + bdayyear);
		System.out.println("a buck fifty is $" + buckfifty);
	}
}
