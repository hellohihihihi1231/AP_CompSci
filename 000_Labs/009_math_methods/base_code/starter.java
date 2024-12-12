import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		//a. Max (13 - 6 * 11, 30 % 7 * (-2))
		System.out.println(Math.max(13 - 6 * 11, 30 % 7 * (-2)));
		//b. Sqrt (3 * 8 + 31 % 7)
		System.out.println(Math.sqrt(3 * 8 + 31 % 7));
		//c. Pow (37 / 3, 35 % 21)
		System.out.println(Math.pow(37 / 3, 35 % 21));
		//d. Max( Pow( 2,14%3) , Sqrt ( 2*6) )
		System.out.println(Math.max(Math.pow(2, 14%3), Math.sqrt(2*6)));
		
		
		System.out.println("enter a double value for x");
		double x = in.nextDouble();
		System.out.println("enter a double value for y");
		double y = in.nextDouble();
		System.out.println("max: " + Math.max(x,y));
		System.out.println("sqrt of y: " + Math.sqrt(y));
		System.out.println("power of x^y:" + Math.pow(x,y));
	}
}
