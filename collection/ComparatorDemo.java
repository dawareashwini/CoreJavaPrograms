package collection;
//created Ashwini daware
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id, salary;
	String name;

	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee[id=" + id + ",salary=" + salary + ",name=" + name + "]";
	}
}

class SalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if (e1.salary == e2.salary)
			return 0;
		else if (e1.salary > e2.salary)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, 20000, "Paras"));
		list.add(new Employee(102, 30000, "Raj"));
		list.add(new Employee(103, 24000, "Nupur"));
		list.add(new Employee(104, 68000, "Harshada"));
		list.add(new Employee(105, 22000, "Pooja"));
		System.out.println("Sorting on the basist of salary:");
		Collections.sort(list, new SalaryComparator());
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
