package junit;

public class Square {
	public int square(int a) {
		return a * a;
	}

	public int countA(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
}
