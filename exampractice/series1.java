package exampractice;

import java.util.Scanner;

public class series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of an n:");
		n = sc.nextInt();
		System.out.println("The series is:");
		for (i = 1; i <= n; i = i + 2) {
			System.out.println(i + "");
		}
		System.out.println();
	}

}
