/*
 *	Author:  Isaac Lee
 *  Date: 11/1/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		
		PooleDwarf dwarf1 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf dwarf2 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf dwarf3 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf dwarf4 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf dwarf5 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf dwarf6 = new PooleDwarf(randName(), (int)(Math.random()*100));
		PooleDwarf dwarf7 = new PooleDwarf(randName(), (int)(Math.random()*100));
		
		int numDuplicates = 0;
		if(dwarf1.isSameName(dwarf2.getName())) {
			numDuplicates ++;
		}
		
		if(dwarf1.isSameName(dwarf3.getName())) {
			numDuplicates ++;
		}
		
		if(dwarf1.isSameName(dwarf4.getName())) {
			numDuplicates ++;
		}
		
		if(dwarf1.isSameName(dwarf5.getName())) {
			numDuplicates ++;
		}
		
		if(dwarf1.isSameName(dwarf6.getName())) {
			numDuplicates ++;
		}
		
		if(dwarf1.isSameName(dwarf7.getName())) {
			numDuplicates ++;
		}
		
		System.out.println(dwarf1.getName() + " was the name with " + numDuplicates + " matches!"); 
	}
}
