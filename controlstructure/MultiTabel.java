package controlstructure;

import java.util.Scanner;

public class MultiTabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an number :");
		int n;
		n = scanner.nextInt();
		for (int i = n; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			
		}
	}

}
