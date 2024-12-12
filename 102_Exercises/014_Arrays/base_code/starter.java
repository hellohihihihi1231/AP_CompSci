/*
 *	Author: Isaac Lee
 *  Date: 11/5/24
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] arr1 = new int[1001];
		 int i = 1;
		 arr1[0] = 3;
		 while(i < 1001) {
		 	arr1[i] = arr1[i-1] + 3;
		 	i ++;
		 }
		 
		 int[] arr2 = new int[1001];
		 i = 1; 
		 arr2[0] = 1000;
		 while(i < 1001) {
		 	arr2[i] = arr2[i-1]-1;
		 	i ++;
		 }
		 
		 for(int j = 0; j < 1001; j ++) {
		 	System.out.print(arr1[j] +  ", ");
		 }
		 for(int j = 0; j < 1001; j++) {
		 	System.out.print(arr2[j] + ", ");
		 }
		 
	}
}
