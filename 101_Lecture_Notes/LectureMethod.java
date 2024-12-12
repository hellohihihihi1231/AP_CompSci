/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        for(int i = 0; i < 5; i ++) {    
            printAnimal();
        }
        greeting("Isaac");
        double newSalary = raise(100000.0, 100);
        System.out.println(newSalary);
        newSalary = raise(newSalary, 100);
        System.out.println(newSalary);
	}
	
	public static void printAnimal() {
	    System.out.println("  / _ \\");
	    System.out.println("\\_\\(_)/_/");
	    System.out.println(" _//o\\\\_");
	    System.out.println("  /   \\");
	}
	
	public static void greeting(String name) {
	    System.out.println("Greetings, " + name);
	}
	
	public static double raise(double salary, int raisePercent) {
	    return salary + (salary * (raisePercent/100.0));
	}
}