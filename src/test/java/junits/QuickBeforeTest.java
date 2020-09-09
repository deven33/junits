package junits;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class QuickBeforeTest {
	
	@BeforeClass
	public static void beforeclass() {
		System.out.println("before class");
	}
	
	@Before
	public void before() {
		System.out.println("before");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@After
	public void after() {
		System.out.println("after");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("after class");
	}

}
