package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//1.create list of integers and display even numbers uding Stream API

public class StreamApiQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(21);
		list.add(25);
		list.add(44);
		list.add(56);
		list.add(89);
		list.add(98);
		System.out.println("Given list: " + list);
		List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Displaying even number from given list" + evenNumbers);

	}

}
