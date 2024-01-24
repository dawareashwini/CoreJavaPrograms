package controlstructure;

public class FibonacciNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, firstnumber = 0, secondnumber = 1;
		System.out.print(firstnumber + " " + secondnumber + " ");
		for (int i = 2; i < n; i++) {
			int nextTerm = firstnumber + secondnumber;
			System.out.print(nextTerm + " ");
			firstnumber = secondnumber;
			secondnumber = nextTerm;
		}
	}

}
