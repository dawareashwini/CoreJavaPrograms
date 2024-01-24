package arrayex;

import java.util.Scanner;

public class Arrays2DAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int rsize, csize, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size first matrix and it same in both tables:");
		rsize = sc.nextInt();
		System.out.println("Enter column size first matrix and it same in both tables:");
		csize = sc.nextInt();
		int a[][] = new int[rsize][csize];
		int b[][] = new int[rsize][csize];
		System.out.println("Enter the all elements in first matrix :");
		for (i = 0; i < rsize; i++) {
			for (j = 0; j < csize; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Ener the all elements in second matrix :");
		for (i = 0; i < rsize; i++) {
			for (j = 0; j < csize; j++) {
				b[i][j] = sc.nextInt();
			}

		}
		System.out.println("Addition of array elements are :");
		for (i = 0; i < rsize; i++) {
			for (j = 0; j < csize; j++) {
				System.out.println(a[i][j] + b[i][j] + " ");
			}

		}

	}
}
