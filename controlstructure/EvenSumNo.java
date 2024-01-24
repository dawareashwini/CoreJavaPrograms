package controlstructure;

public class EvenSumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 50, end = 100, sum = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of even numbers between:" + start + " and " + end + " is: " + sum);
	}

}
