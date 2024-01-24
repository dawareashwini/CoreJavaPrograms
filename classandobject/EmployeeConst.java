package classandobject;

public class EmployeeConst {
	int id;
	String name;

	public EmployeeConst() {
		id = 101;
		name = "raj";
	}

	public EmployeeConst(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void print() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeConst e1 = new EmployeeConst();
		e1.print();
		EmployeeConst e2 = new EmployeeConst(102,"Riya");
		e2.print();
	}
}
