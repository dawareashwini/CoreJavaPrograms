package java8features;

//create list of strings and display strings which starts with character 's

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Sakshi");
		list.add("Karthikadevi");
		list.add("Rincy");
		list.add("Sneha");
		list.add("Hemlatha");
		list.add("Darshini");
		System.out.println("Given String list:" + list);
		List<String> list2 = list.stream().filter(s -> s.startsWith("s") || s.startsWith("S"))
				.collect(Collectors.toList());
		System.out.println("Displaying String starts with 's' in given list: " + list2);
	}

}
