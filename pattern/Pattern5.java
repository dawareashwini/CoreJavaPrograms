package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5, i, j;
		for (i = rows; i >= 1; --i) {
			for (j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
