package pattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 0;
		for (int i = 4; i > row;--i) {
			for (int j = 4; j >= row; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}