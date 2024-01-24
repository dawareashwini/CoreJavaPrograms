package classandobject;

import java.util.Scanner;

public class CreateClassDepositor {
	public static double amount(double principle, int years) {
		double r;
		if (years < 1) {
			r = 9.0;
		} else if (years <= 3) {
			r = 9.25;
		} else if (years <= 5) {
			r = 9.5;
		} else {
			r = 9.75;
		}
		double p = 1 + r / 100;
		return principle * Math.pow(p, years);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter depositor name: ");
		String depositorName = scanner.nextLine();

		System.out.print("Enter principle amount: ");
		double principleAmount = scanner.nextDouble();

		System.out.print("Enter number of years: ");
		int numberOfYears = scanner.nextInt();
		double accumulatedAmount = amount(principleAmount, numberOfYears);

		System.out.println("Depositor's Name: " + depositorName);
		System.out.println("Principle Amount: " + principleAmount);
		System.out.println("Number of Years: " + numberOfYears);
		System.out.println("Accumulated Amount: " + accumulatedAmount);
	}

}
