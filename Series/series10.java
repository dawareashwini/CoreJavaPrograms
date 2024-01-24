package Series;

public class series10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1/1! + 2/2! +  ... + n/n! = ?
 double sum=0;
		for (double i = 1; i <= 5; i++) {
			double fact = 1;
			for (double j = i; j > 1; j--) {
				fact = fact * j;
			}
			System.out.print((int)i + "/" +(int) i + "!");
			if (i < 5) {
				
				System.out.print(" + ");
			}
			sum=sum+(i/fact);

		}
		System.out.println(" = " +sum);
	}

}
