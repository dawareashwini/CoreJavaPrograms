package codingchallenges;

import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Coding Challenge:
Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:class Source:
visibility: public
method definition:
insertSpace(String s): method that uses lambda expression to format a given string, where a space is inserted between each character of string.
return type: String
Task
Create a Source class and implement below given method:
• insertSpace(String s): Use lambda expression to format a given string, where a space is inserted between each character of string
Implement using Lambda expressions.
Sample Input:
capgemini

Sample Output:
c a p g e m i n i
 */
public class Source1 {
	@FunctionalInterface
	interface Space {
		String insertSpace(String s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string:");
		String input = sc.nextLine();
		String s = input.toString().chars().mapToObj(c -> (char) c + " ").collect(Collectors.joining()).trim();
		System.out.println("After inserted space in string:");
		System.out.println(s);

	}
}
