/*
 *	Author: Isaac Lee
 *  Date: 10/5/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money..");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		
		int money = 100; 
		
		while(money > 0) {
			System.out.println("--------------------------------------------------\n");
				System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
				String choice = in.nextLine();
				while(!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n"))) {
					System.out.println("That wasn't quite the correct answer. Try again.");
					System.out.println("--------------------------------------------------\n");
					System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
					choice = in.nextLine();
				}
			if(choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
				System.out.println("Sad to see you go! You still have $" + money +" left. Come again soon! Thanks!");
				break;
			}
			else if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				int wager = in.nextInt();
				in.nextLine();
				while(wager > money || wager <= 0) {
					if(wager > money) {
						System.out.print("You only have $" + money + "! Please enter a smaller number :");
						wager = in.nextInt();
						in.nextLine();
					}
					else if(wager <= 0) {
						System.out.print("Sneaky! No negatives or 0! Please enter a larger number :");
						wager = in.nextInt();
						in.nextLine();
					}
				}
				money -= wager;
				System.out.println("");
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are: \n");
				int num1 = (int)(Math.random() * 9) + 1;
				int num2 = (int)(Math.random() * 9) + 1;
				int num3 = (int)(Math.random() * 9) + 1;
				System.out.println("_______________________");
				System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " |");
				System.out.println("_______________________");
				if(num1 == num2 && num2 == num3) {
					System.out.println("You hit the jackpot! You're wager has now been tripled!");
					money += wager * 3;
				}
				else if(num1 == num2 || num2 == num3 || num1 == num3) {
					System.out.println("You won! You're wager has now been doubled!");
					money += wager * 2;
				}
				else {
					System.out.println("Didn't win this time, better luck next time!");
				}
				System.out.println("You now have $" + money + ".");
				
				if(money <= 0) {
					System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				}
			}
		}
	}
}
