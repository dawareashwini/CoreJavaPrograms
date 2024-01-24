package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountATest {
	@Test
	public void test() {
		Square sc = new Square();
		int result1 = sc.countA("Ankita");
		assertEquals(2, result1);
	}

}
