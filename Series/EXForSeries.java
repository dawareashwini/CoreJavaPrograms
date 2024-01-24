package Series;

public class EXForSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0.0;
		System.out.println("Series:");
		for (int i = 2; i <= 20; i += 2) {
			double term = 1.0 / i;
			sum += term;
			System.out.println("1/" + i);
			if (i < 20) {
				System.out.println(" + ");
			}
		}
		System.out.println("\n Sum of the series :" + sum);
	}

}
