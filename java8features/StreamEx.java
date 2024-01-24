package java8features;

import java.util.ArrayList;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Sakshi");
		list.add("Karthikadevi");
		list.add("Rincy");
		list.add("Sneha");
		list.add("Hemlatha");
		list.add("Darshini");
//count name with length less than 7
//without using stream api
		int count = 0;
		for (String string : list) {
			if (string.length() < 7) {
				count++;
			}
		}
		System.out.println("There are " + count + " Strings with length less than 7");
		// with Stream api
		long count1 = list.stream().filter(Str -> Str.length() < 7).count();
		System.out.println("There are " + count1 + " Strings with length less than 7");
	}

}
