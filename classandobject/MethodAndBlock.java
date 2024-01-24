package classandobject;

public class MethodAndBlock {
	public MethodAndBlock() {
		System.out.println("Inside constructor..");
	}

	{
		System.out.println("Inside intance block..");
	}
	static {
		System.out.println("Inside static block..");
	}

	public void print() {
		System.out.println("Inside method..");

	}

	public static void show() {
		System.out.println("static method..");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodAndBlock obj = new MethodAndBlock();
		obj.print();
		show();
	}

}
