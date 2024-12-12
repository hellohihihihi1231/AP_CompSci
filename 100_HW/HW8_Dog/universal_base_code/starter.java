/*
 *	Author: Isaac Lee
 *  Date: 10/27/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		/*Main:
			- Create two dogs.
			   - Create the first dog with a name. Then set the age to something
			   - Create the second dog with a name and a breed.
			- Check if the first dog is sleeping.
			   - If it's sleeping, print out it's asleep
			   - If it's awake, bark!
			- Then for the second dog, check if it's sleeping.
			   - If it's sleeping, and the first dog barks, make it bark. Otherwise it does nothing.
			   - If it's awake and the first dog barks, make it bark. Otherwise it does nothing.*/
			   
		System.out.println("Dog name?");
		String name = in.nextLine();
		System.out.println("What age should " + name + " be?");
		int age = in.nextInt();
		Dog dog1 = new Dog(name, age);
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + " that is " + dog1.getAge() + " years old!");
		Dog dog2 = new Dog("Toto", "Cairn Terrier");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " years old!");
		boolean dog1IsSleeping = dog1.isSleeping();
		if(dog1IsSleeping) {
			System.out.println(dog1.getName() + " is sleeping! Don't wake " + dog1.getName() + " up!");
		}
		else {
			System.out.println(dog1.getName() + " is awake!");
			dog1.bark();
		}
		
		boolean dog2IsSleeping = dog2.isSleeping();
		if(dog1IsSleeping && dog2IsSleeping) {
			System.out.println(dog2.getName() + " is sleeping too!");
		}
		else if(dog1IsSleeping && !dog2IsSleeping) {
			System.out.println(dog2.getName() + " isn't sleeping!");
		}
		else if(!dog1IsSleeping) {
			System.out.println(dog2.getName() + " hears " + dog1.getName() + "!");
			dog2.bark();
		}
	}
}
