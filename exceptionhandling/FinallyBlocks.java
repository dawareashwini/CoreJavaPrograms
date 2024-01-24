package exceptionhandling;

public class FinallyBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("case 1:while execution doesn't occur.");
		try {
			int a = 25 / 0;
			System.out.println("Div:" + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("case 1:finally block always executes.");
		}
		System.out.println("case 1:rest of code...");
		System.out.println("..........................................................");

		System.out.println("\n case 2:while execution occura and handled..");
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("case 2:finally block always executes.");
		}
		System.out.println("case 2:rest of code...");
		System.out.println("..........................................................");

		System.out.println("\n case 3:while execution occura and handled..");
		try {
			int a = 25 / 0;
			System.out.println("Div:" + a);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("case 3:finally block always executes.");
		}
		System.out.println("case 3:rest of code...");
		System.out.println("..........................................................");
	}

}
