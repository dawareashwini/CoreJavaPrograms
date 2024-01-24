package arrayex;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size = scanner.nextInt();
		int a[] = new int[size];
		int sum = 0;
		System.out.println("Enter elements array: ");
		for (i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Elements of the array are: " + Arrays.toString(a));
		System.out.println("Sum of the elements of the array =" + sum);
	}

}
