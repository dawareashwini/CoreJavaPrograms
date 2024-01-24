package exampractice;

public class RightTriangleP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 5;
		System.out.println("right angled triangle:");
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
