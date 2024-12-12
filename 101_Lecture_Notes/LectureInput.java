/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a name");
        String name = in.nextLine();
        System.out.println("hello " + name);
        System.out.println("enter a number");
        int num1 = in.nextInt();
        System.out.println("enter a second number");
        int num2 = in.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        in.nextLine();
        System.out.println("what is your favorite food?");
        String food = in.nextLine();
        
	}
}