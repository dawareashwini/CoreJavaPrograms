package designPatterns;

class SingleObject{
	
	//Create an Object
	private static SingleObject instance = new SingleObject();
		
	//create private constructor so that this class can not be instatiate
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
		
	}
	
	public void show() {
		System.out.println("accessing method using single object");
	}
}


public class SingletonPattern {

	public static void main(String[] args) {
		//We can't create object of singleObject class because constructor is private
		SingleObject obj = SingleObject.getInstance();
		obj.show();

	}

}
