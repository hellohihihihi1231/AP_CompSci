// Isaac Lee
// 11/24/24


import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		//System.out.println(CVMath.findMid(2,3,1));
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter how many magic squares you want to see: ");
		int num = in.nextInt();
		CVMath.specialSquare(num);
	}
}
