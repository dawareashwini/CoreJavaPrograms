package classandobject;

import java.util.Scanner;

public class CreateAreaOfCRT {
	public void circle() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an radius :");
		int r = scanner.nextInt();
		System.out.println("Area of circle is: " + (Math.PI * r * r));
	}

	public int square() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an side :");
		int s = scanner.nextInt();
		return s * s;
	}

	public void rectangle(double length, double width) {
		System.out.println("Area of rectangle is: " + (length * width));
	}

	public double triangle(double base, double height) {
		return 0.5 * base * height;
	}
	public static void add(int a,int b) {
		System.out.println("Add:"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a class Area and 4 methods circle, square, rectangle and triangle and
		// calculate area ;
		CreateAreaOfCRT obj = new CreateAreaOfCRT();
		obj.circle();
		System.out.println();
		int res = obj.square();
		System.out.println("Area of square is: " + res);
		System.out.println();
		obj.rectangle(9.8, 6.5);
		System.out.println();
		double result = obj.triangle(25.5, 66.7);
		System.out.println("Area of triangle is: " + result);
		CreateAreaOfCRT.add(20, 5);
	}
}
