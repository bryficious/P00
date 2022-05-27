import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		  Calculator cal = new Calculator();
		  int actual = cal.add(a, b);
		  int expected = 5555;
		  assertEquals (expected, actual);
	}
	
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		  Calculator cal = new Calculator();
		  int actual = cal.subtract(a, b);
		  int expected = 5555;
		  assertNotEquals (expected, actual);
	}
	
	@Test
	public final void testMultiply() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		  Calculator cal = new Calculator();
		  int actual = cal.multiply(a, b);
		  int expected = 5555;
		  assertNotEquals (expected, actual);
	}
	
	@Test
	public final void testDivide() {
		//fail("Not yet implemented");
		int a = 4000;
		int b = 1000;
		
		  Calculator cal = new Calculator();
		  int actual = cal.divide(a, b);
		  int expected = 4;
		  assertEquals (expected, actual);
	}

}
