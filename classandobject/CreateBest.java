package classandobject;

import java.util.Scanner;

public class CreateBest {
	String custName;
	long phoneNo;
	int numCalls;
	double tax;
	double bill;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter customer name:");
		custName = scanner.nextLine();
		System.out.println("Enter customer phone number:");
		phoneNo = scanner.nextLong();
		System.out.println("Enter number of calls:");
		numCalls = scanner.nextInt();
	}

	public void billing() {
		if (numCalls <= 100) {
			bill = 0.0;
		} else if (numCalls <= 200) {
			bill = 0.80 * (numCalls - 100);
		} else if (numCalls <= 200) {
			bill = 0.80 * 200 + 1.25 * (numCalls - 300);
		} else {
			bill = 0.80 * 200 + 1.25 * 200 + 2.50 * (numCalls - 500);
		}
		tax = 0.12 * bill;
		bill = bill + tax;
	}

	public void display() {
		System.out.println("Customer Name: " + custName);
		System.out.println("Phone Number: " + phoneNo);
		System.out.println("Number of Calls: " + numCalls);
		System.out.println("Bill Amount: Rs. " + bill);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateBest customer = new CreateBest();
		customer.accept();
		customer.billing();
		customer.display();
	}

}
