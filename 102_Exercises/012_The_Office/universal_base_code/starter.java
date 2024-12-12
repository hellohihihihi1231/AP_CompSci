/*
 *	Author: Isaac Lee
 *  Date: 10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee john = new Employee(2222, "John", "Whitman", 4500);
		
		michael.raiseSalary(20);
		dwight.raiseSalary(31);
		jim.raiseSalary(34);
		pam.raiseSalary(40);
		john.raiseSalary(11);
		
		michael.employeeToString();
		System.out.println("Michael's annual salary: $" + michael.getAnnualSalary());
		
		dwight.employeeToString();
		System.out.println("Dwight's annual salary: $" + dwight.getAnnualSalary());
		
		jim.employeeToString();
		System.out.println("Jim's annual salary: $" + jim.getAnnualSalary());
		
		pam.employeeToString();
		System.out.println("Pam's annual salary: $" + pam.getAnnualSalary());
		
		john.employeeToString();
		System.out.println("John's annual salary: " + john.getAnnualSalary());
	}
}
