package java8features;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = new String[5];
//arr[3]="Welcome to EduBridge";
		Optional<String> result = Optional.ofNullable(arr[3]);
		if (result.isPresent()) {
			String upperCase = arr[3].toUpperCase();
		} else {
			System.out.println("String is not present at 3rd postions");
		}
	}

}
