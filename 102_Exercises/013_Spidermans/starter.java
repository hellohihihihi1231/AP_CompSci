/*
	Author: Isaac lee
	Date: 10/28/24
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman x = new Spiderman();
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillain("Green Goblin");
		
		Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setAge(28);
		z.setVillain("The Vulture");
		
		System.out.println("The villain is " + y.getVillain());
		
		Spiderman a = new Spiderman("Shameik Moore", 29);
		a.setVillain("The Kingpin");
		
	}
}
