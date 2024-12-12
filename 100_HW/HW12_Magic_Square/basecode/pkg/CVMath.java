package pkg;

public class CVMath {		
	//public static int findMid(int one, int two, int three)
	//{
	//	return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	//}
	public static void specialSquare(int n) {
		int[] specialSquares = new int[n];
		int counter = 0;
		int i = 1;
		
		while(counter < n) {
			int perfectSquare = i * i;
			int sum = 0;
			int j = 1;
			while(sum < perfectSquare) { 
				sum += j;
				j ++;
			}
			
			if(sum == perfectSquare) {
				specialSquares[counter] = perfectSquare;
				counter ++;
			}
			
			i ++;
		}
		
		for(int e = 0; e < specialSquares.length; e++) { 
			System.out.println(specialSquares[e]);
		}
	}
}
