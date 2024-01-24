/*create a class Employee with the following data members and member functions.
		Data members : empName,empCode, basicSalary, allowance, grossSalary, tax, netSalary
		Member Functions :
		void accept() : to input empName, empCode, basicSalary
		void allow() : to calc and store allowance as 55% of basicSalary.  
		void gross() : to calc and store grossSalary as sum of basicSalary and allowance
		void tax() : to calc and store tax as 12% of grossSalary
		void net() : to calc and store netSalary as grossSalary less tax.
		void display() : to display salary slip containing empCode, empName, basicSalary, tax and netSalary
		void main() : create an object of a class and execute all methods in logical order.*/

package classandobject;

import java.util.Scanner;

public class CreateEmpClass {

	double grossSalary, netSalary, tax, allowance, basicSalary;
	String empName;
	int empCode;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee name: ");
		empName = scanner.nextLine();
		System.out.println("Enter employee code: ");
		empCode = scanner.nextInt();
		System.out.println("Enter employee basic salary: ");
		basicSalary = scanner.nextDouble();
	}

	public void allow() {
		allowance = 0.55 * basicSalary;
	}

	public void gross() {
		grossSalary = basicSalary + allowance;
	}

	public void tax() {
		tax = 0.12 * grossSalary;
	}

	public void net() {
		netSalary = grossSalary - tax;
	}

	public void display() {
		System.out.println("Salary Slip");
		System.out.println("Employee Code: " + empCode);
		System.out.println("Employee Name: " + empName);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Tax: " + tax);
		System.out.println("Net Salary: " + netSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateEmpClass obj = new CreateEmpClass();
		obj.accept();
		obj.allow();
		obj.gross();
		obj.tax();
		obj.net();
		obj.display();
	}

}
