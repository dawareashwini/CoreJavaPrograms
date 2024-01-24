package stringexample;

public class FreqOfCharacter {
//Program TO find the frequency of characters from the string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, count = 0, c, j;

		String strValue = new String("Hello ankita");
		String str = strValue.toLowerCase();
		int freq[] = new int[str.length()];
		char str11[] = new char[str.length()];
//			char str1[] = str.toCharArray();
//			for (i = 0; i < str1.length; i++) {
//				System.out.println(str1[i]);
//			}
		for (i = 0; i < str.length(); i++) {

			str11[i] = str.charAt(i);

		}
//			for (i = 0; i < str11.length; i++) {
//				System.out.println(str11[i]);
//			}

		for (i = 0; i < str11.length; i++) {
			freq[i] = 1;
			count = 0;
			c = str.charAt(i);
			for (j = i + 1; j < str11.length; j++) {

				if (str11[i] == str11[j]) // ankita - a==a f[0]=1+1=2; str1=ankit0
				{
					freq[i]++;
					str11[j] = '0';
				}

			}

		}
		for (i = 0; i < freq.length; i++) {

			if (str11[i] != '0' && str11[i] != ' ') {

				System.out.println(str11[i] + " - " + freq[i]);
			}
		}
	}

}
