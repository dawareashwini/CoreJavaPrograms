package arrayex;

import java.util.Scanner;

public class StudentDesending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numberofstu = 5, i;
		int[] rollNo = new int[numberofstu];
		int[] marks = new int[numberofstu];
		System.out.println("Enter roll numbers and marks for 5 students:");
		for (i = 0; i < numberofstu; i++) {
			rollNo[i] = scanner.nextInt();
			marks[i] = scanner.nextInt();
		}
		for (i = 0; i < numberofstu - 1; i++) {
			for (int j = 0; j < numberofstu - i - 1; j++) {
				if (marks[j] < marks[j + 1]) {
					int tempMark = marks[j];
					marks[j] = marks[j + 1];
					marks[j + 1] = tempMark;
					int tempRoll = rollNo[j];
					rollNo[j] = rollNo[j + 1];
					rollNo[j + 1] = tempRoll;
				}
			}
		}
		System.out.println("Roll Numbers and Marks in Descending Order of Marks:");
		for (i = 0; i < numberofstu; i++) {
			System.out.println("Roll Number: " + rollNo[i] + ", Marks: " + marks[i]);

		}

	}
}
