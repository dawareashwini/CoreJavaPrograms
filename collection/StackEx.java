package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		stack.push("Gauva");
		stack.push("Mango");
		stack.push("Gauva");
		stack.push("Apple");
		stack.push("Banana");
		stack.push(null);
		System.out.println("Stack:" + stack);
		System.out.println("Removing element:" + stack.pop());
		System.out.println("Stack after Removing element:" + stack);
		System.out.println("Search Mango:" + stack.search("Mango"));
		System.out.println("Search watermelon:" + stack.search("watermelon"));

	}

}
