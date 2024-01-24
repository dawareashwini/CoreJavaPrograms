package arrayex;

import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rsize, csize;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size :");
		rsize = sc.nextInt();
		System.out.println("Enter column size :");
		csize = sc.nextInt();
		int a[][] = new int[rsize][csize];
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				System.out.println("Enter elemnets in array: ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array:    ");
		for (int i = 0; i < rsize; i++) {
			for (int j = 0; j < csize; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println(  );

		}

	}
}
