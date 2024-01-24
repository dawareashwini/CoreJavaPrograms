package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {
	@Test
	public void test() {
		Square sc = new Square();
		int result = sc.square(3);
		assertEquals(9, result);
	}

	@Test
	public void test1() {
		Square sc = new Square();
		int result1 = sc.countA("Ankita");
		assertEquals(2, result1);
	}
}