package exampractice;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0, i, term;
		System.out.println("Series:");
		for (i = 2; i <= 20; i += 2) {
			term = 1 / i;
			sum = sum + term;
			System.out.println("1/" + i);
			if (i < 20) {
				System.out.println(" + ");
			}
		}
		System.out.println("sum of the series is:" + sum);
	}

}
