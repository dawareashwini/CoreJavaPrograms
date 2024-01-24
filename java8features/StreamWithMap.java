package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(56);
		marks.add(50);
		marks.add(70);
		marks.add(86);
		marks.add(66);
		marks.add(46);
		marks.add(90);
		System.out.println("Marks before updating:" + marks);
		List<Integer> updatedMarks = marks.stream().map(i -> i + 10).collect(Collectors.toList());
		System.out.println("Marks After Updating: " + updatedMarks);
	}

}
