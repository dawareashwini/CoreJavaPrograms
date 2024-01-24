package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*3.Create list of employee, (Employee-id,name,age,salary). 
i.display employees whose salary is greater than 50000.
ii. add 5000 bonus whose salary is less than 30000 and display*/
class Employee {
	int id, age, salary;
	String name;

	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee[Id:" + id + "Name:" + name + "Age:" + age + "Salary:" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

public class StreamApiEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Ankita", 24,40000));
		list.add(new Employee(102, "Pooja", 23,50000));
		list.add(new Employee(103, "Ashu", 20,60000));
		list.add(new Employee(104, "Nisha", 29,70000));
		list.add(new Employee(105, "sanika", 19,55000));
		
		List<Employee> highSalaryEmployees = Employee.stream() .filter(Employee -> Employee.getSalary() > 50000).collect(Collectors.toList());
		 System.out.println("Employees with salary greater than 50000:");
	     highSalaryEmployees.forEach(System.out::println);
	     Employee.stream() .filter(Employee -> Employee.getSalary() < 30000).forEach(Employee -> Employee.setSalary(Employee.getSalary() + 5000));
	     System.out.println("\nEmployees after adding a 5000 bonus to those with salary less than 30000:");
	     Employee.forEach(System.out::println);
	}

}
