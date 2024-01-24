package basic;

public class Student {

	int id;
	public int age;
	String name;// instance variable...
	static String colgName = "D.Y.Patil";// Static...

	public Student(int id, int age, String name)// local variable
	{
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public void display() {
		System.out.println("Student Id : " + id);
		System.out.println("Student age : " + age);
		System.out.println("Student Name : " + name);
		System.out.println("College Name : " + colgName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(101, 20, "Riya");
		Student student2 = new Student(102, 23, "Ashu");
		student1.display();
		student2.display();

	}

}
