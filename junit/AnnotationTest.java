package junit;

//import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {
	@Test
	public void test1() {
		System.out.println("Test case 1:inside test case");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2:inside test case");
	}

	@Before
	public void before() {
		System.out.println("Inside Before");
	}

	@After
	public void after() {
		System.out.println("Inside After");
	}

	@Ignore
	public void ignore() {
		System.out.println("Inside Ignore: it will not execute");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Inside After Class");
	}
}
