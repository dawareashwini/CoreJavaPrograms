package controlstructure;

import java.util.Scanner;

public class Eligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		if (age >= 18) {
			System.out.println("Your are eligible for licenes.");
		} else {
			System.out.println("Your are not eligible for licenes.");
		}
	}

}
