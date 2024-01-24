package pattern;

import java.util.Scanner;

public class Patterns6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows value:");
		int rows = sc.nextInt();
		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j > i; j--) {
				System.out.println("");
			}
			for (int k = 1; k <= i; k++) {
				System.out.println("*");
			}

			System.out.println("");
		}

	}

}