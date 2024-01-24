package Series;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an number: ");
		int n = scanner.nextInt();
		System.out.println("The series is:");
		for (int i = 1; i <= n; i += 2) {
			int square = i * i;
			System.out.print(square);
			if (i < n - 1) {
				System.out.print(" ");
			}
		}

	}

}
