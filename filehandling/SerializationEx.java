package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee employee = new Employee(101, "AShu", "programmer");
		FileOutputStream outputStream = new FileOutputStream("C:\\java\\ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		System.out.println("Converted employee object in to byte stream....");
	}

}
