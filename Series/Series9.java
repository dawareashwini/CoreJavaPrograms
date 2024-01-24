package Series;

public class Series9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "-" + (i + 1));
			if (i < 9) {
				System.out.print(" + ");
			}
			sum = sum + (i - (i + 1));
		}
		System.out.println("sum of the series is: " + sum);
	}
}