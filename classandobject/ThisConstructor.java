package classandobject;

public class ThisConstructor {
	String str;

	public ThisConstructor() {
		this("calling this() Constructor");
		str = "abc";
	}

	public ThisConstructor(String str) {
		this.str = str;
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor obj = new ThisConstructor();
		obj.print();
	}

}
