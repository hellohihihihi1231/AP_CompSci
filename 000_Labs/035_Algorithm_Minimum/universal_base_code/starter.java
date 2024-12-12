/*
 *	Author:  Isaac Lee
 *  Date: 11/7/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr = new int[(int)(Math.random()*150+51)];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int average = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
			average += arr[i];
		}
		average /= arr.length;
		System.out.println("There are " + arr.length + " elements");
		System.out.println("The maximum of "  + arr.length + " random numbers is: " + max);
		System.out.println("The minimum of "  + arr.length + " random numbers is: " + min);
		System.out.println("The average of "  + arr.length + " random numbers is: " + average);


		
	}
}
