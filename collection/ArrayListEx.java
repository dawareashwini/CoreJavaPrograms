package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Ashu");
		list.add(23);
		list.add(null);
		list.add("AShu");
		list.add(23.908);
		System.out.println("List Elements:" + list);
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("rose");
		list2.add("Lilly");
		list2.add("Lotus");
		list2.add("Rose");
		//list2.add(null);
		System.out.println("Generic list:" + list2);
		System.out.println("Itreating list using Itreator Interface:");
		Iterator<String> iterator = list2.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Iterating list using for each loop:");
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println("After sorting:");
		Collections.sort(list2);
		for (String string : list2) {
			System.out.println(string);
		}

	}

}
