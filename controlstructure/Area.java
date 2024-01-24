package controlstructure;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r, b, l, rb, h, ac, at, ar;
		Scanner scanner = new Scanner(System.in);
		System.out.println("MENU:");
		System.out.println("1.Area of a circle");
		System.out.println("2.Area of a rectangle");
		System.out.println("3.Area of a triangle");
		int choice;
		System.out.println("Enter your choice:");
		choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter radius: ");
			r = scanner.nextFloat();
			ac = 3.14f * r * r;
			System.out.println("Area of circle is:" + ac);
			break;
		case 2:
			System.out.println("Enter lenght: ");
			l = scanner.nextFloat();
			System.out.println("Enter breadth: ");
			rb = scanner.nextFloat();
			ar = l * rb;
			System.out.println("Area of rectangle is:" + ar);
			break;
		case 3:
			System.out.println("Enter base: ");
			b = scanner.nextFloat();
			System.out.println("Enter height: ");
			h = scanner.nextFloat();
			at = b * h / 2;
			System.out.println("Area of triangle is:" + at);
			break;
		default:
			System.out.println("Invalid choice...");
		}
	}

}
