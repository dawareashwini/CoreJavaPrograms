package codingchallenges;

import java.util.Scanner;

public class AsscessmentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int a, b, c, i, j;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		for (i = 0; i <= a; i++) {
			for (j = 1; j <= a - i; j++) // add space
			{
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++)// add number
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (i = 0; i <= b; i++) {
			for (j = 1; j <= b - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		for (i = 0; i <= c; i++) {
			for (j = 1; j <= c - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
