/*
 *	Author: Isaac Lee  
 *  Date: 11/14/24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] warriors = new Warrior[100];
		Wizard[] wizards = new Wizard[100];
		for(int i = 0; i < warriors.length; i ++) {
			warriors[i] = new Warrior();
			wizards[i] = new Wizard();
		}
		
		int currentWizard = 0;
		int currentWarrior = 0;
		while(!wizards[99].isDead()) {
			wizards[currentWizard].attack(warriors[currentWarrior]);
			if(warriors[currentWarrior].isDead()) 
				currentWarrior++;
				
			if(warriors[99].isDead()) 
				break;
				
			warriors[currentWarrior].attack(wizards[currentWizard]);
			if(wizards[currentWizard].isDead())
				currentWizard++;
		}
		if(wizards[99].isDead()) {
			System.out.println("Warriors won with " + (100-currentWarrior) + " left in their army.");
		}
		else if(warriors[99].isDead()) {
			System.out.println("Wizards won with " + (100-currentWizard) + " left in their army.");
		}
	}
}
