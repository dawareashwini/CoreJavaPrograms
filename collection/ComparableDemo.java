package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//created by Ashwini Daware
class Student implements Comparable<Student>{
	int rollnumber,age;
	String name;
	public Student(int rollnumber, int age, String name) {
		super();
		this.rollnumber = rollnumber;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(101, 23, "Paras"));
		list.add(new Student(102, 27, "Nupur"));
		list.add(new Student(103, 21, "Meera"));
		list.add(new Student(104, 24, "Raj"));
		list.add(new Student(105, 22, "Harshada"));
		
		System.out.println("List after Sorting :");
		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student);
	}
	}

}
