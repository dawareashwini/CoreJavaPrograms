package arrayex;

import java.util.Scanner;

public class ArrayFreqPN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pcount = 0, ncount = 0, zcount = 0, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Size:");
		n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements :");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				pcount++;
			else if (a[i] < 0)
				ncount++;
			else
				zcount++;
		}
		System.out.println("Frequency of positive number is: " + pcount + ". Frequency of negative number is :" + ncount
				+ ". Frequency of zeroth number is:" + zcount);
	}

}
