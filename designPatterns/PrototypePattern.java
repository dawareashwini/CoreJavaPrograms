package designPatterns;

interface Prototype {
	public Prototype getClone();
}

class Employee implements Prototype {
	private int id, age;
	private String name;
	private float salary;

	public Employee(int id, int age, String name, float salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new Employee(id, age, name, salary);
	}
}

public class PrototypePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, 23, "Ashwini", 30000);
		System.out.println(emp1);

		Employee emp2 = (Employee) emp1.getClone();
		System.out.println(emp2);
	}

}
