/*
 *	Author: Isaac Lee
 *  Date: 10/9/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num = in.nextInt();
		in.nextLine();
		printPrimes(num);
	}
	
	public static boolean checkPrime(int num) {
		int i = num - 1;
		
		while(i > 1) {
			if(num % i == 0) {
				return false; 
			}
			
			i --;
		}
		return true;
	}
	
	public static void printPrimes(int num) {
		int i = 2; 
		while (i <= num) {
			boolean isPrime = checkPrime(i);
			if(isPrime == true) {
				System.out.println(i);
			}
			i ++;
		}
	}
}
