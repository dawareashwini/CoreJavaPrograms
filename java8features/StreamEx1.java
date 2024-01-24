package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>names=Arrays.asList("Raj","Sakshi","Rincy","Hemalatha","Karthikadevi","Darshini");
//create a stream
Stream<String>allnames=names.stream();
//perform intermediate operation
Stream<String>longNames= allnames.filter(str -> str.length() > 7);

//perform terminal operation
		System.out.println("Using forEach();");
		longNames.forEach(str -> System.out.println(str));
//single line
		List<String> namesCollect = names.stream().filter(str -> str.length() > 7).collect(Collectors.toList());
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Using collect():");
//namesCollect.forEach(str->System.out.println(str));
		namesCollect.forEach(System.out::println);
	}

}
