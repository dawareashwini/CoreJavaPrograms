package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashset = new HashSet<String>();
		hashset.add("Raj");
		hashset.add("Rani");
		hashset.add("Raj");
		hashset.add("Ravi");
		hashset.add(null);
		System.out.println("HashSet Implemntation:");
		for (String string : hashset) {
			System.out.print(string + " ,");
		}
		System.out.println();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Gauva");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Apple");
		linkedHashSet.add(null);
		System.out.println("Linked Hash Set Implementation:" + linkedHashSet);
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Pizza");
		treeSet.add("Pav Bhajii");
		treeSet.add("Coffee");
		treeSet.add("Cold Coffee");
		System.out.println("Tree Set Implementation:" + treeSet);

	}

}
