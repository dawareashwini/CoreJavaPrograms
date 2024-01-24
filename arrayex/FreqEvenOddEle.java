package arrayex;

import java.util.Scanner;

public class FreqEvenOddEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ecount = 0, ocount = 0, n, i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of arrys elements: ");
		n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements :");
		for (i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				ecount++;
			else
				ocount++;

		}
		System.out.println("Frequency of even number is: " + ecount + " ,Frequency of odd number is: " + ocount);
	}
}
