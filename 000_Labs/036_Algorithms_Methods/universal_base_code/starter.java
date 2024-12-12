/*
 *	Author:
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
	}

	public static int getArrayAverage(int[] arr) {
		int average = 0;
		for(int i = 0; i < arr.length; i ++) {
			average += arr[i];
		}
		return average /= arr.length;
	}

	public static int getArrayMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] > max) 
				max = arr[i];
		}
		return max;
	}

	public static int getArrayMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] < min) 
				min = arr[i];
		}
		return min;
	}
	
	
	
	
	public static void main(String args[]) {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = (int)(Math.random()*99+1);
		}
	
		toStringArray(arr);
		System.out.println("The average of the array is: " + getArrayAverage(arr));
		System.out.println("The max of the array is: " + getArrayMax(arr));
		System.out.println("The min of the array is: " + getArrayMin(arr));
		
	}
}
