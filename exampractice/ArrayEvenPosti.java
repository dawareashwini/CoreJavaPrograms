package exampractice;

import java.util.Scanner;

public class ArrayEvenPosti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 56, 78, 9, 4, 7 };
		System.out.print("Elements at even positions: ");
		for (int i = 1; i < a.length; i += 2) {
			System.out.print(a[i] + " ");
		}

	}

}