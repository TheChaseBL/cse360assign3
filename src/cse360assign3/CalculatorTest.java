/**
 * @author Chase Lybbert
 * @version Final Version
 * PIN: 520
 */

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator testCalculator = new Calculator();
		assertNotNull(testCalculator);
	}
	
	@Test
	public void testGetTotal() {
		Calculator testCalculator = new Calculator();
		assertEquals(0, testCalculator.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator testCalculator = new Calculator();
		testCalculator.add(5);
		assertEquals(5, testCalculator.getTotal());
	}
	
	@Test
	public void testSubtract() {
		Calculator testCalculator = new Calculator();
		testCalculator.add(5);
		testCalculator.subtract(3);
		assertEquals(2, testCalculator.getTotal());
	}
	
	@Test
	public void testMultiply() {
		Calculator testCalculator = new Calculator();
		testCalculator.add(5);
		testCalculator.multiply(3);
		assertEquals(15, testCalculator.getTotal());
	}
	
	@Test
	public void testDivide() {
		Calculator testCalculator = new Calculator();
		testCalculator.add(10);
		testCalculator.divide(2);
		assertEquals(5, testCalculator.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator testCalculator = new Calculator();
		testCalculator.add(10);
		testCalculator.divide(2);
		testCalculator.multiply(8);
		testCalculator.subtract(6);
		assertEquals("0 + 10 / 2 * 8 - 6", testCalculator.getHistory());
	}
	
	@Test
	public void testDivideByZero() {
		Calculator testCalculator = new Calculator();
		testCalculator.add(10);
		testCalculator.divide(0);
		assertEquals(0, testCalculator.getTotal());
	}

}