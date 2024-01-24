package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import filehandling.Employee;

//5.create class employee with id name and age properties, create list of Employees
//and sort it on the basis of name(use lambda and forEach method)
public class EmployeeEx {
	int id, age;
	String name;

	public EmployeeEx(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmployeeEx[id=" + id + ",age=" + age + ",name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeEx> list = new ArrayList<>();
		{
			list.add(new EmployeeEx(101, 20, "Ankita"));
			list.add(new EmployeeEx(102, 22, "Shweta"));
			list.add(new EmployeeEx(103, 21, "Pooja"));
			list.add(new EmployeeEx(104, 19, "Shivani"));
			list.add(new EmployeeEx(105, 18, "Sonali"));
			Collections.sort(list, (e1, e2) -> {
				return e1.name.compareTo(e2.name);
			});
			// foreach method
			list.forEach(e -> System.out.println(e));
		}
	}

}
